package joshie.harvestmoon.buildings.blacksmith;

import java.util.ArrayList;

import joshie.harvestmoon.buildings.Building;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableAnvil;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableBlock;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableButton;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableDoor;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableFurnace;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableIFaceable;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableStairs;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableTorches;
import joshie.harvestmoon.buildings.placeable.blocks.PlaceableTrapDoor;
import joshie.harvestmoon.buildings.placeable.entities.PlaceableItemFrame;
import joshie.harvestmoon.init.HMBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;

public class BuildingBlacksmith extends Building {
    public BuildingBlacksmith() {
        list = new ArrayList(383);
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 0, 10));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 5, 0, 10));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 1, 1, 1));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 1, 1, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 1, 1, 7));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 1, 1, 8));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 1, 1, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 1, 1, 10));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 2, 1, 0));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 2, 1, 1));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 1, 2));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 2, 1, 3));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 2, 1, 4));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 2, 1, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 1, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 2, 1, 7));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 1, 8));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 1, 9));
        list.add(new PlaceableBlock(Blocks.lava, 0, 2, 1, 10));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 1, 11));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 3, 1, 1));
        list.add(new PlaceableBlock(Blocks.planks, 5, 3, 1, 2));
        list.add(new PlaceableBlock(Blocks.planks, 5, 3, 1, 3));
        list.add(new PlaceableBlock(Blocks.planks, 5, 3, 1, 4));
        list.add(new PlaceableBlock(Blocks.planks, 5, 3, 1, 5));
        list.add(new PlaceableBlock(Blocks.planks, 5, 3, 1, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 3, 1, 7));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 3, 1, 8));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 3, 1, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 3, 1, 10));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 3, 1, 11));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 4, 1, 1));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 1, 2));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 1, 3));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 1, 4));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 1, 5));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 1, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 4, 1, 7));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 4, 1, 8));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 4, 1, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 4, 1, 10));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 4, 1, 11));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 5, 1, 0));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 5, 1, 1));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 5, 1, 2));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 5, 1, 3));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 5, 1, 4));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 5, 1, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 5, 1, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 5, 1, 7));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 5, 1, 8));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 5, 1, 9));
        list.add(new PlaceableBlock(Blocks.lava, 0, 5, 1, 10));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 5, 1, 11));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 6, 1, 1));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 6, 1, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 6, 1, 7));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 6, 1, 8));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 6, 1, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 6, 1, 10));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 1, 2, 1));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 1, 2, 5));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 1, 2, 7));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 1, 2, 8));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 1, 2, 9));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 1, 2, 10));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 2, 2, 0));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 2, 2, 1));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 2, 2, 2));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 2, 2, 3));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 2, 2, 4));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 2, 2, 5));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 2, 2, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 2, 2, 7));
        list.add(new PlaceableAnvil(Blocks.anvil, 8, 2, 2, 8));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 2, 2, 9));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 2, 2, 11));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 3, 2, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 1, 3, 2, 2));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 2, 3));
        list.add(new PlaceableItemFrame(null, 0, 0, 3, 2, 3));
        list.add(new PlaceableStairs(Blocks.dark_oak_stairs, 5, 3, 2, 5));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 15, 3, 2, 6));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 2, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 2, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 2, 9));
        list.add(new PlaceableFurnace(Blocks.lit_furnace, 2, 3, 2, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 3, 2, 11));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 4, 2, 1));
        list.add(new PlaceableBlock(Blocks.fence, 0, 4, 2, 2));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 14, 4, 2, 6));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 2, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 2, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 2, 9));
        list.add(new PlaceableFurnace(Blocks.lit_furnace, 2, 4, 2, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 4, 2, 11));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 5, 2, 0));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 5, 2, 1));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 5, 2, 2));
        list.add(new PlaceableDoor(Blocks.wooden_door, 0, 5, 2, 3));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 5, 2, 4));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 5, 2, 5));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 5, 2, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 5, 2, 7));
        list.add(new PlaceableIFaceable(HMBlocks.cookware, 9, 5, 2, 8, ForgeDirection.WEST));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 5, 2, 9));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 5, 2, 11));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 6, 2, 1));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 6, 2, 5));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 6, 2, 7));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 6, 2, 8));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 6, 2, 9));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 6, 2, 10));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 1, 3, 1));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 1, 3, 5));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 1, 3, 7));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 1, 3, 8));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 1, 3, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 1, 3, 10));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 2, 3, 0));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 2, 3, 1));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 2, 3, 2));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 2, 3, 3));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 2, 3, 4));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 2, 3, 5));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 4, 2, 3, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 5, 2, 3, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 2, 3, 8));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 2, 3, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 3, 10));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 2, 3, 11));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 3, 3, 1));
        list.add(new PlaceableBlock(Blocks.flower_pot, 4, 3, 3, 5));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 15, 3, 3, 6));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 3, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 3, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 3, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 3, 3, 10));
        list.add(new PlaceableItemFrame(new ItemStack(Items.iron_sword, 1, 0), 0, 2, 3, 3, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 3, 3, 11));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 4, 3, 1));
        list.add(new PlaceableBlock(Blocks.carpet, 12, 4, 3, 2));
        list.add(new PlaceableTrapDoor(Blocks.trapdoor, 14, 4, 3, 6));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 3, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 3, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 3, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 4, 3, 10));
        list.add(new PlaceableItemFrame(new ItemStack(Items.iron_sword, 1, 0), 0, 2, 4, 3, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 4, 3, 11));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 5, 3, 0));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 5, 3, 1));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 5, 3, 2));
        list.add(new PlaceableDoor(Blocks.wooden_door, 8, 5, 3, 3));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 5, 3, 4));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 5, 3, 5));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 5, 5, 3, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 4, 5, 3, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 5, 3, 8));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 5, 3, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 5, 3, 10));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 5, 3, 11));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 6, 3, 1));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 6, 3, 2));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 6, 3, 4));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 6, 3, 5));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 6, 3, 7));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 6, 3, 8));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 6, 3, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 6, 3, 10));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 1, 4, 0));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 1, 4, 1));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 1, 4, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 1, 4, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 1, 4, 8));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 1, 4, 9));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 2, 4, 0));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 2, 4, 1));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 7, 2, 4, 2));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 2, 4, 3));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 6, 2, 4, 4));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 2, 4, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 4, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 4, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 2, 4, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 2, 4, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 2, 4, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 5, 3, 4, 1));
        list.add(new PlaceableTorches(Blocks.torch, 4, 3, 4, 5));
        list.add(new PlaceableItemFrame(new ItemStack(Blocks.trapdoor, 1, 0), 0, 2, 3, 4, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 3, 4, 6));
        list.add(new PlaceableTorches(Blocks.torch, 3, 3, 4, 7));
        list.add(new PlaceableItemFrame(new ItemStack(Blocks.trapdoor, 1, 0), 0, 0, 3, 4, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 4, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 4, 9));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 4, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 3, 4, 11));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 4, 4, 4, 1));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 4, 4, 3));
        list.add(new PlaceableTorches(Blocks.torch, 4, 4, 4, 5));
        list.add(new PlaceableItemFrame(new ItemStack(Blocks.trapdoor, 1, 0), 0, 2, 4, 4, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 4, 4, 6));
        list.add(new PlaceableTorches(Blocks.torch, 3, 4, 4, 7));
        list.add(new PlaceableItemFrame(new ItemStack(Blocks.trapdoor, 1, 0), 0, 0, 4, 4, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 4, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 4, 9));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 4, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 4, 4, 11));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 5, 4, 0));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 5, 4, 1));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 7, 5, 4, 2));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 5, 5, 4, 3));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 6, 5, 4, 4));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 5, 4, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 5, 4, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 5, 4, 7));
        list.add(new PlaceableBlock(Blocks.web, 0, 5, 4, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 5, 4, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 5, 4, 10));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 6, 4, 0));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 6, 4, 1));
        list.add(new PlaceableBlock(Blocks.cobblestone_wall, 0, 6, 4, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 6, 4, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 6, 4, 8));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 6, 4, 9));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 1, 5, 1));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 1, 5, 2));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 1, 5, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 1, 5, 4));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 1, 5, 5));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 1, 5, 8));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 1, 5, 9));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 2, 5, 0));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 2, 5, 1));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 2, 5, 2));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 2, 5, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 2, 5, 4));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 2, 5, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 2, 5, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 5, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 2, 5, 8));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 2, 5, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 5, 10));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 3, 5, 0));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 3, 5, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 5, 3, 5, 2));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 5, 3, 5, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 5, 3, 5, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 6, 3, 5, 5));
        list.add(new PlaceableBlock(Blocks.planks, 5, 3, 5, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 7, 3, 5, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 5, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 5, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 3, 5, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 3, 5, 11));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 4, 5, 0));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 4, 5, 1));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 7, 4, 5, 2));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 4, 4, 5, 3));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 4, 4, 5, 4));
        list.add(new PlaceableStairs(Blocks.spruce_stairs, 4, 4, 5, 5));
        list.add(new PlaceableBlock(Blocks.planks, 5, 4, 5, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 7, 4, 5, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 5, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 5, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 4, 5, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 4, 5, 11));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 5, 5, 0));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 5, 5, 1));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 5, 5, 2));
        list.add(new PlaceableBlock(Blocks.double_wooden_slab, 1, 5, 5, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 9, 5, 5, 4));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 13, 5, 5, 5));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 5, 5, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 5, 5, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 5, 5, 8));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 5, 5, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 5, 5, 10));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 6, 5, 1));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 6, 5, 2));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 6, 5, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 6, 5, 4));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 6, 5, 5));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 6, 5, 8));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 6, 5, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 1, 6, 7));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 1, 6, 8));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 1, 6, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 1, 6, 10));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 2, 6, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 2, 6, 7));
        list.add(new PlaceableBlock(Blocks.web, 0, 2, 6, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 2, 6, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 6, 10));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 2, 6, 11));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 3, 6, 1));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 3, 6, 2));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 3, 6, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 3, 6, 4));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 3, 6, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 3, 6, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 3, 6, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 6, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 6, 9));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 6, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 1, 3, 6, 11));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 4, 6, 1));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 4, 6, 2));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 4, 6, 3));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 4, 6, 4));
        list.add(new PlaceableBlock(Blocks.wooden_slab, 5, 4, 6, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 4, 6, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 4, 6, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 6, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 6, 9));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 6, 10));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 0, 4, 6, 11));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 5, 6, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 5, 6, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 5, 6, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 5, 6, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 5, 6, 10));
        list.add(new PlaceableButton(Blocks.wooden_button, 3, 5, 6, 11));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 6, 6, 7));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 3, 6, 6, 8));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 2, 6, 6, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 6, 6, 10));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 0, 7, 8));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 0, 7, 9));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 1, 7, 7));
        list.add(new PlaceableBlock(Blocks.stonebrick, 2, 1, 7, 8));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 1, 7, 9));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 1, 7, 10));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 2, 7, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 1, 2, 7, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 2, 7, 8));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 2, 7, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 2, 7, 10));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 2, 7, 11));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 3, 7, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 3, 7, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 7, 3, 7, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 7, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 7, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 1, 3, 7, 10));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 3, 7, 11));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 4, 7, 5));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 4, 7, 6));
        list.add(new PlaceableStairs(Blocks.stone_brick_stairs, 7, 4, 7, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 7, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 7, 9));
        list.add(new PlaceableButton(Blocks.wooden_button, 2, 4, 7, 10));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 4, 7, 11));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 5, 7, 6));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 5, 7, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 5, 7, 8));
        list.add(new PlaceableButton(Blocks.wooden_button, 4, 5, 7, 9));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 5, 7, 10));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 5, 7, 11));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 6, 7, 7));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 6, 7, 8));
        list.add(new PlaceableBlock(Blocks.stonebrick, 0, 6, 7, 9));
        list.add(new PlaceableBlock(Blocks.stone_slab, 8, 6, 7, 10));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 1, 8, 8));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 1, 8, 9));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 2, 8, 7));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 2, 8, 8));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 2, 8, 9));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 2, 8, 10));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 3, 8, 6));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 3, 8, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 3, 8, 8));
        list.add(new PlaceableBlock(Blocks.web, 0, 3, 8, 9));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 3, 8, 10));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 3, 8, 11));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 4, 8, 6));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 4, 8, 7));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 8, 8));
        list.add(new PlaceableBlock(Blocks.air, 0, 4, 8, 9));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 4, 8, 10));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 4, 8, 11));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 5, 8, 7));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 5, 8, 8));
        list.add(new PlaceableBlock(Blocks.double_stone_slab, 0, 5, 8, 9));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 5, 8, 10));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 6, 8, 8));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 6, 8, 9));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 3, 9, 8));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 3, 9, 9));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 4, 9, 8));
        list.add(new PlaceableBlock(Blocks.stone_slab, 0, 4, 9, 9));
    }
}
