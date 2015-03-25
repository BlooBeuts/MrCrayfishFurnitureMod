/**
 * MrCrayfish's Furniture Mod
 * Copyright (C) 2014  MrCrayfish (http://www.mrcrayfish.com/)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mrcrayfish.furniture.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class FurnitureCrafting
{
	public static void register()
	{
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemTableWood, 1), new Object[] { "***", " * ", " * ", '*', "plankWood" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemTableStone, 1), new Object[] { "***", " * ", " * ", '*', "cobblestone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemChairWood, 1), new Object[] { "*  ", "***", "* *", '*', "plankWood" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemChairStone, 1), new Object[] { "*  ", "***", "* *", '*', "cobblestone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCouch, 1), new Object[] { "***", "***", '*', new ItemStack(Blocks.wool, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemFridge, 1), new Object[] { "***", "*#*", "*@*", '*', "blockIron", '#', "chestWood", '@', Blocks.furnace });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCabinet, 1), new Object[] { "***", "*@*", "***", '*', "plankWood", '@', "chestWood" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCurtains, 2), new Object[] { "@@@", "* *", "@ @", '*', "ingotGold", '@', new ItemStack(Blocks.wool, 1, 14) });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemBlinds, 2), new Object[] { "***", "***", "***", '*', "stickWood" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCoolPack, 2), new Object[] { "***", "*@*", "***", '*', "blockGlass", '@', Items.water_bucket });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCoffeeTableWood, 1), new Object[] { "***", "* *", '*', "plankWood" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCoffeeTableStone, 1), new Object[] { "***", "* *", '*', "cobblestone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemLamp, 2), new Object[] { "***", "*@*", " & ", '*', Blocks.wool, '@', "glowstone", '&', Blocks.obsidian });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemBedsideCabinet, 1), new Object[] { "***", "*@*", "*@*", '*', "plankWood", '@', "chestWood" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemOven, 1), new Object[] { "***", "*@*", "***", '*', "blockIron", '@', Blocks.furnace });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemOvenRangehood, 1), new Object[] { " * ", " * ", "*@*", '*', "ingotIron", '@', "glowstone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemHedgeBasic, 4), new Object[] { "***", "***", '*', new ItemStack(Blocks.leaves, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemHedgeSpruce, 4), new Object[] { "***", "***", '*', new ItemStack(Blocks.leaves, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemHedgeBirch, 4), new Object[] { "***", "***", '*', new ItemStack(Blocks.leaves, 1, 2) });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemHedgeJungle, 4), new Object[] { "***", "***", '*', new ItemStack(Blocks.leaves, 1, 3) });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemBirdBath, 1), new Object[] { "***", " * ", " * ", '*', Blocks.stone });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemStonePath, 8), new Object[] { "**", '*', "cobblestone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemTap, 1), new Object[] { " @ ", "***", "  *", '*', "stone", '@', "ingotIron" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemMailBox, 1), new Object[] { "*@*", "***", " * ", '*', "plankWood", '@', Items.book });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemEnvelope, 1), new Object[] { "**", '*', Items.paper });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemPackage, 1), new Object[] { "***", "***", '*', Items.paper });
		GameRegistry.addShapelessRecipe(new ItemStack(FurnitureItems.itemDoorBell, 1), Blocks.noteblock, Blocks.stone_button);
		GameRegistry.addShapelessRecipe(new ItemStack(FurnitureItems.itemWhiteFence, 2), Blocks.oak_fence, "dyeWhite");
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemComputer, 1), new Object[] { "***", "*@*", "*&*", '*', "blockIron", '@', "paneGlass", '&', "dustRedstone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemPrinter, 1), new Object[] { "*@*", "&R&", "***", '*', "stone", '@', Items.paper, '&', "blockIron", 'R', "dustRedstone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemElectricFence, 8), new Object[] { "***", "*@*", "*#*", '*', "ingotIron", '@', FurnitureItems.itemWhiteFence, '#', Blocks.redstone_torch });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemFireAlarm, 1), new Object[] { "*#*", "*@*", '*', "ingotIron", '@', Blocks.noteblock, '#', "dustRedstone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemTV, 1), new Object[] { "***", "*@*", "*&*", '*', "logWood", '@', "paneGlass", '&', "dustRedstone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemStereo, 1), new Object[] { " * ", "NJN", '*', "ingotIron", 'N', Blocks.noteblock, 'J', Blocks.jukebox });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCeilingLight, 4), new Object[] { "O", "S", "G", 'O', Blocks.obsidian, 'S', "stone", 'G', "glowstone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemInkCartridge, 2), new Object[] { "SSS", "SIS", "SSS", 'I', "dyeBlack", 'S', "stone" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemTree, 1), new Object[] { " L ", "LLL", " P ", 'L', "treeLeaves", 'P', Items.flower_pot });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemPresentRed, 1), new Object[] { "RRR", "RPR", "RRR", 'R', new ItemStack(Blocks.wool, 1, 14), 'P', FurnitureItems.itemPackage });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemPresentGreen, 1), new Object[] { "GGG", "GPG", "GGG", 'G', new ItemStack(Blocks.wool, 1, 13), 'P', FurnitureItems.itemPackage });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemToilet, 1), new Object[] { "QB ", "QQQ", " Q ", 'Q', "blockQuartz", 'B', Blocks.stone_button });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemBasin, 1), new Object[] { "BIB", "QQQ", " Q ", 'Q', "blockQuartz", 'B', Blocks.stone_button, 'I', "ingotIron" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemWallCabinet, 1), new Object[] { "QQQ", "QCQ", "QQQ", 'Q', "blockQuartz", 'C', "chestWood" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemShower, 1), new Object[] { "QGQ", "QGQ", "QGQ", 'Q', "blockQuartz", 'G', "glass" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemBin, 1), new Object[] { "BSB", "I I", "III", 'B', Blocks.heavy_weighted_pressure_plate, 'S', "stone", 'I', "ingotIron" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemBath, 1), new Object[] { "B  ", "Q Q", "QQQ", 'Q', "blockQuartz", 'B', Blocks.stone_button });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemShowerHead, 1), new Object[] { "II ", " I ", "SSS", 'S', "stone", 'I', "ingotIron" });
		GameRegistry.addShapelessRecipe(new ItemStack(FurnitureItems.itemSoap), Items.clay_ball, "dyeWhite" , "dyeLightBlue");
		GameRegistry.addShapelessRecipe(new ItemStack(FurnitureItems.itemSoapyWater), Items.water_bucket, FurnitureItems.itemSoap);
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemSuperSoapyWater), new Object[] { "GGG", "GSG", "GGG", 'G', "ingotGold", 'S', FurnitureItems.itemSoapyWater });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemToaster), new Object[] { "QBQ", "QPS", "WWW", 'Q', "blockQuartz", 'B', Blocks.iron_bars, 'S', "stone", 'P', Blocks.piston, 'W', new ItemStack(Blocks.wool, 1, 15) });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemMicrowave), new Object[] { "IIQ", "GGB", "IIQ", 'I', "ingotIron", 'Q', "blockQuartz", 'G', "paneGlass", 'B', Blocks.stone_button });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemBlender), new Object[] { "GBG", "GIG", "BBB", 'G', "paneGlass", 'B', new ItemStack(Blocks.wool, 1, 15), 'I', "ingotIron" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemWashingMachine), new Object[] { "QQQ", "QGQ", "QFQ", 'Q', "blockQuartz", 'G', "paneGlass", 'F', Blocks.furnace });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemDishWasher), new Object[] { "QQQ", "CBC", "CFC", 'Q', "blockQuartz", 'G', "paneGlass", 'F', Blocks.furnace, 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 9), 'B', Blocks.iron_bars });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCounterDoored), new Object[] { "CCC", "QQQ", "QQQ", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 9), 'Q', "blockQuartz" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCounterSink), new Object[] { "CSC", "QQQ", "QQQ", 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 9), 'S', FurnitureItems.itemBasin, 'Q', "blockQuartz" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemKitchenCabinet), new Object[] { "QQQ", "HCH", "QQQ", 'Q', "blockQuartz", 'C', "chestWood", 'H', new ItemStack(Blocks.stained_hardened_clay, 1, 9) });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemPlate), new Object[] { "Q Q", " Q ", 'Q', "blockQuartz" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCookieJar), new Object[] { " W ", "G G", "GGG", 'W', new ItemStack(Blocks.wool, 1, 15), 'G', "paneGlass" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemBarStool), new Object[] { "WWW", "CCC", "Q Q", 'W', new ItemStack(Blocks.wool, 1, 0), 'C', new ItemStack(Blocks.stained_hardened_clay, 1, 9), 'Q', "blockQuartz" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemChoppingBoard), new Object[] { "LLL", "SSS", "LLL", 'L', new ItemStack(Blocks.log, 1, 0), 'S', new ItemStack(Blocks.wooden_slab, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemKnife), new Object[] { "I ", " S", 'I', "stone", 'S', "stickWood" });
		GameRegistry.addRecipe(new ItemStack(FurnitureItems.itemCup), new Object[] { "G G", "G G", "GGG", 'G', "paneGlass" });
		GameRegistry.addSmelting(FurnitureItems.itemFlesh, new ItemStack(FurnitureItems.itemCookedFlesh), 0.05F);
	}
}
