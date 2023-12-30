/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 */
package colorblocksplus.blocks;

import colorblocksplus.ColorBlocksPlus;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ColorBlocksPlusBlock
extends Block {
    public ColorBlocksPlusBlock(String colorId) {
        super(Material.rock);
        this.setBlockName("ColorBlocksPlus" + colorId);
        this.setBlockTextureName("colorblocksplus:" + colorId);
        this.setCreativeTab(ColorBlocksPlus.ColorBlocksPlusBlocksTab);
        this.setResistance(50.0f);
        this.setHardness(0.1f);
        this.setStepSound(Block.soundTypeStone);
    }
}

