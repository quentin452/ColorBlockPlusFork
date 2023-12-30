/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.block.material.Material
 */
package colorblocksplus.blocks;

import colorblocksplus.ColorBlocksPlus;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class ColorBlocksPlusSlab
extends BlockSlab {
    static ColorBlocksPlus Color = new ColorBlocksPlus();
    private String colorId;

    public ColorBlocksPlusSlab(Block block, boolean fullBlock) {
        super(fullBlock, Material.rock);
        this.colorId = block.getUnlocalizedName().replaceAll(".*ColorBlocksPlus", "");
        this.setBlockName("ColorBlocksPlus" + this.colorId + "Slab");
        this.setBlockTextureName("colorblocksplus" + ":" + this.colorId);
        if (!fullBlock) {
            this.setCreativeTab(ColorBlocksPlus.ColorBlocksPlusSlabsTab);
        }
        this.setResistance(50.0f);
        this.setHardness(0.1f);
        this.setStepSound(Block.soundTypeStone);
        this.setLightOpacity(0);
    }

    public String func_150002_b(int i) {
        return super.getUnlocalizedName();
    }
}

