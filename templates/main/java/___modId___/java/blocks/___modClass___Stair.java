/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This file is licensed under the terms of the GNU General Public License v3.0.
*/

package ___modId___.blocks;

import ___modId___.___modClass___;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class ___modClass___Stair extends BlockStairs {
    private String colorId;

    public ___modClass___Stair(Block block) {
        super(block, 1);
        this.colorId = block.getUnlocalizedName().replaceAll(".*___modClass___", "");
        this.setBlockName("___modClass___"  + this.colorId + "Stair");
        this.setCreativeTab(___modClass___.___modClass___StairsTab);
        this.setResistance(___blockResistance___);
        this.setHardness(___blockHardness___);
        this.setStepSound(___blockStepSound___);
    }
}
