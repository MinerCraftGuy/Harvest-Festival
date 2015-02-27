package joshie.harvestmoon.crops;

import java.util.HashMap;

import joshie.harvestmoon.core.network.PacketCropRequest;
import joshie.harvestmoon.core.network.PacketHandler;
import joshie.harvestmoon.init.HMItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CropTrackerClient {
    private HashMap<WorldLocation, CropData> crops = new HashMap();

    private WorldLocation getKey(World world, int x, int y, int z) {
        return new WorldLocation(world.provider.dimensionId, x, y - 1, z);
    }

    public int getCropStage(World world, int x, int y, int z) {
        return crops.get(getKey(world, x, y, z)).getStage();
    }

    public IIcon getIconForCrop(World world, int x, int y, int z) {
        WorldLocation location = getKey(world, x, y, z);
        CropData data = crops.get(location);
        if (data == null) { //If we don't have the crop loaded in the cache, request the data for it.
            PacketHandler.sendToServer(new PacketCropRequest(world, x, y, z));
            return Blocks.obsidian.getIcon(0, 0);
        }

        return crops.get(getKey(world, x, y, z)).getIcon();
    }

    public ItemStack getStackForCrop(World world, int x, int y, int z) {
        WorldLocation key = getKey(world, x, y, z);
        CropData data = crops.get(key);
        if (data == null) return new ItemStack(Blocks.cactus); //Because why not?
        ItemStack seeds = new ItemStack(HMItems.seeds);
        seeds.setItemDamage(data.getCrop().getCropMeta() + ((data.getQuality() - 1) * 100));
        return seeds;
    }

    public String getCropName(World world, int x, int y, int z) {
        CropData data = crops.get(getKey(world, x, y, z));
        return data == null ? null : data.getName();
    }

    public ItemStack harvest(World world, int x, int y, int z) {
        WorldLocation key = new WorldLocation(world.provider.dimensionId, x, y, z);
        CropData data = crops.get(key);
        if (data == null) return null;
        else {
            ItemStack ret = data.harvest();
            if (ret != null) {
                if (!data.doesRegrow()) {
                    crops.remove(key);
                }

                return ret;
            } else return null;
        }
    }

    public boolean canHarvest(World world, int x, int y, int z) {
        WorldLocation key = new WorldLocation(world.provider.dimensionId, x, y, z);
        CropData data = crops.get(key);
        if (data == null) return false;
        return data.harvest() != null;
    }

    public void sync(boolean isRemoval, WorldLocation location, CropData data) {
        if (isRemoval) {
            crops.remove(location);
        } else crops.put(location, data);
    }
}
