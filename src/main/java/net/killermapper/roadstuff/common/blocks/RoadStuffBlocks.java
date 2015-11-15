/*
Road Stuff - A Minecraft MODification by KillerMapper - 2015

The MIT License (MIT)

Copyright (c) 2015 KillerMapper

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package net.killermapper.roadstuff.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.killermapper.roadstuff.common.RoadStuff;
import net.killermapper.roadstuff.common.items.ItemBlockAsphaltArrows01;
import net.killermapper.roadstuff.common.items.ItemBlockAsphaltBase01;
import net.killermapper.roadstuff.common.items.ItemBlockAsphaltCorner01;
import net.killermapper.roadstuff.common.items.ItemBlockAsphaltLines01;
import net.killermapper.roadstuff.common.items.ItemBlockAsphaltLines02;
import net.killermapper.roadstuff.common.items.ItemBlockAsphaltLines03;
import net.killermapper.roadstuff.common.items.ItemBlockAsphaltLines04;
import net.killermapper.roadstuff.common.items.ItemBlockAsphaltLines05;
import net.killermapper.roadstuff.common.items.ItemBlockCone01;
import net.minecraft.block.Block;

public class RoadStuffBlocks
{
    public static Block blockAsphaltLines01;
    public static Block blockAsphaltBase01;
    public static Block blockEntityTest;
    public static Block blockCone01;
    public static Block blockAsphaltLinesCorner01;
    public static Block blockAsphaltArrows01;
    public static Block blockAsphaltLines02;
    public static Block blockAsphaltLines03;
    public static Block blockAsphaltLines04;
    public static Block blockAsphaltLines05;

    public static void initBlocks()
    {
        RoadStuffBlocks.blockAsphaltLines01 = new BlockAsphaltLines01().setBlockName("asphaltLines01").setHardness(1.0F).setResistance(5.0F);
        RoadStuffBlocks.blockAsphaltLines02 = new BlockAsphaltLines02().setBlockName("asphaltLines02").setHardness(1.0F).setResistance(5.0F);
        RoadStuffBlocks.blockAsphaltLines03 = new BlockAsphaltLines03().setBlockName("asphaltLines03").setHardness(1.0F).setResistance(5.0F);
        RoadStuffBlocks.blockAsphaltLines04 = new BlockAsphaltLines04().setBlockName("asphaltLines04").setHardness(1.0F).setResistance(5.0F);
        RoadStuffBlocks.blockAsphaltLines05 = new BlockAsphaltLines05().setBlockName("asphaltLines05").setHardness(1.0F).setResistance(5.0F);
        RoadStuffBlocks.blockAsphaltBase01 = new BlockAsphaltBase01().setBlockName("asphaltBase01").setHardness(1.0F).setResistance(5.0F);
        RoadStuffBlocks.blockAsphaltLinesCorner01 = new BlockAsphaltLinesCorner01().setBlockName("asphaltLinesCorner01").setHardness(1.0F).setResistance(5.0F);
        RoadStuffBlocks.blockAsphaltArrows01 = new BlockAsphaltArrows01().setBlockName("asphaltLinesArrows01").setHardness(1.0F).setResistance(5.0F);
        RoadStuffBlocks.blockCone01 = new BlockCone01().setBlockName("cone01").setHardness(1.0F).setResistance(1.0F);

        // Test
        RoadStuffBlocks.blockEntityTest = new TestEntityBlock().setHardness(1.0F).setResistance(10.0F).setBlockName("EntityTest").setBlockTextureName(RoadStuff.MODID + ":asphaltSewerManhole").setCreativeTab(RoadStuff.RoadStuffCreativeTabs);

        RoadStuffBlocks.registerBlocks();
        RoadStuffBlocks.setHarvestLevels();
    }

    public static void setHarvestLevels()
    {
        RoadStuffBlocks.blockAsphaltLines01.setHarvestLevel("pickaxe", 1);
        RoadStuffBlocks.blockAsphaltLines02.setHarvestLevel("pickaxe", 1);
        RoadStuffBlocks.blockAsphaltLines03.setHarvestLevel("pickaxe", 1);
        RoadStuffBlocks.blockAsphaltLines04.setHarvestLevel("pickaxe", 1);
        RoadStuffBlocks.blockAsphaltLines05.setHarvestLevel("pickaxe", 1);
        RoadStuffBlocks.blockAsphaltBase01.setHarvestLevel("pickaxe", 1);
        RoadStuffBlocks.blockAsphaltLinesCorner01.setHarvestLevel("pickaxe", 1);
        RoadStuffBlocks.blockAsphaltArrows01.setHarvestLevel("pickaxe", 1);
        RoadStuffBlocks.blockCone01.setHarvestLevel("pickaxe", 0);

    }

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(blockAsphaltLines01, ItemBlockAsphaltLines01.class, "asphaltLines01");
        GameRegistry.registerBlock(blockAsphaltLines02, ItemBlockAsphaltLines02.class, "asphaltLines02");
        GameRegistry.registerBlock(blockAsphaltLines03, ItemBlockAsphaltLines03.class, "asphaltLines03");
        GameRegistry.registerBlock(blockAsphaltLines04, ItemBlockAsphaltLines04.class, "asphaltLines04");
        GameRegistry.registerBlock(blockAsphaltLines05, ItemBlockAsphaltLines05.class, "asphaltLines05");
        GameRegistry.registerBlock(blockAsphaltBase01, ItemBlockAsphaltBase01.class, "asphaltBase01");
        GameRegistry.registerBlock(blockAsphaltLinesCorner01, ItemBlockAsphaltCorner01.class, "asphaltLinesCorner01");
        GameRegistry.registerBlock(blockAsphaltArrows01, ItemBlockAsphaltArrows01.class, "asphaltLinesArrows01");
        GameRegistry.registerBlock(blockEntityTest, "entityTest");
        GameRegistry.registerBlock(blockCone01, ItemBlockCone01.class, "cone01");
    }

}
