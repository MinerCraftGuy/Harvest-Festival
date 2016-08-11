package joshie.harvest.buildings.items;

import joshie.harvest.api.core.ICreativeSorted;
import joshie.harvest.core.helpers.generic.BuildingHelper;
import joshie.harvest.core.util.Direction;
import joshie.harvest.buildings.Building;
import joshie.harvest.buildings.BuildingRegistry;
import joshie.harvest.buildings.HFBuildings;
import joshie.harvest.core.HFTab;
import joshie.harvest.core.helpers.TownHelper;
import joshie.harvest.core.base.ItemHFFML;
import joshie.harvest.core.util.Text;
import joshie.harvest.npc.entity.EntityNPCBuilder;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.tuple.Triple;

import static joshie.harvest.core.lib.HFModInfo.MODID;

public class ItemBlueprint extends ItemHFFML<ItemBlueprint, Building> implements ICreativeSorted {
    public ItemBlueprint() {
        super(BuildingRegistry.REGISTRY, HFTab.TOWN);
        setMaxDamage(32000);
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        return false;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
        //Create a builder
        if (!world.isRemote) {
            TownHelper.getClosestBuilderToEntityOrCreate(player);
        }

        Building building = getObjectFromStack(stack);
        if (building != null && !TownHelper.getClosestTownToPlayer(player).hasBuilding(building.getRegistryName())) {
            RayTraceResult raytrace = BuildingHelper.rayTrace(player, 128, 1F);
            if (raytrace == null || raytrace.getBlockPos() == null || raytrace.sideHit != EnumFacing.UP) {
                return new ActionResult(EnumActionResult.PASS, stack);
            }

            Triple<BlockPos, Mirror, Rotation> triple = BuildingHelper.getPositioning(world, raytrace, building, player, hand);
            Direction direction = Direction.withMirrorAndRotation(triple.getMiddle(), triple.getRight());
            EntityNPCBuilder builder = TownHelper.getClosestBuilderToEntityOrCreate(player);
            BlockPos pos = triple.getLeft();
            if (builder != null && !builder.isBuilding() && !TownHelper.getClosestTownToPlayer(player).hasBuilding(building.getRegistryName())) {
                builder.setPosition(pos.getX(), pos.up().getY(), pos.getZ()); //Teleport the builder to the position
                builder.startBuilding(building, pos.up(), direction.getMirror(), direction.getRotation());
                stack.splitStack(1);
                return new ActionResult<>(EnumActionResult.SUCCESS, stack);
            }
        }

        return new ActionResult(EnumActionResult.PASS, stack);
    }

    @Override
    public Building getNullValue() {
        return HFBuildings.null_building;
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return Text.format("harvestfestival.structures.blueprint", getObjectFromStack(stack).getLocalisedName());
    }

    @Override
    public int getSortValue(ItemStack stack) {
        return 105;
    }

    @SideOnly(Side.CLIENT)
    public void registerModels(Item item, String name) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(MODID, "blueprint"), "inventory"));
    }
}
