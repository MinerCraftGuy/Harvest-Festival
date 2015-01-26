package joshie.harvestmoon.items;

import java.util.List;

import joshie.harvestmoon.entities.EntityNPC;
import joshie.harvestmoon.handlers.BuildingCodeGenerator;
import joshie.harvestmoon.init.HMNPCs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCheat extends ItemHMMeta {
    private static int x1, x2, y1, y2, z1, z2;

    @Override
    public int getMetaCount() {
        return 2;
    }
    
    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int xCoord, int yCoord, int zCoord, int side, float hitX, float hitY, float hitZ) {
        if(stack.getItemDamage() == 0) {
            if(player.isSneaking()) {
                x2 = xCoord;
                y2 = yCoord;
                z2 = zCoord;
            } else {
                x1 = xCoord;
                y1 = yCoord;
                z1 = zCoord;
            }
        } else if (stack.getItemDamage() == 1) {
            new BuildingCodeGenerator(world, x1, y1, z1, x2, y2, z2).getCode(player.isSneaking());
        } else if (stack.getItemDamage() == 2 && !world.isRemote) {
            EntityNPC npc = new EntityNPC(world, HMNPCs.goddess);
            npc.setPosition(xCoord, yCoord, zCoord);
            world.spawnEntityInWorld(npc);
        }
        
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
        list.add(new ItemStack(item, 1, 2));
    }
}