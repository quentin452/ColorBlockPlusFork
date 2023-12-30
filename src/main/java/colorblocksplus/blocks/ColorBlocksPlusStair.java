/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockStairs
 */
package colorblocksplus.blocks;

import colorblocksplus.ColorBlocksPlus;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class ColorBlocksPlusStair
extends BlockStairs {
    private String colorId;

    public ColorBlocksPlusStair(Block block) {
        super(block, 1);
        this.colorId = block.getUnlocalizedName().replaceAll(".*ColorBlocksPlus", "");
        this.setBlockName("ColorBlocksPlus" + this.colorId + "Stair");
        this.setCreativeTab(ColorBlocksPlus.ColorBlocksPlusStairsTab);
        this.setResistance(50.0f);
        this.setHardness(0.1f);
        this.setStepSound(Block.soundTypeStone);
    }
}

