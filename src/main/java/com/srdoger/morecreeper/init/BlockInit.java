package com.srdoger.morecreeper.init;

import com.srdoger.morecreeper.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //blocks

    public static final Block test_block = new BlockBase("test_block", Material.GROUND, 6.0f, 30.0f, 3, "shovel");

}