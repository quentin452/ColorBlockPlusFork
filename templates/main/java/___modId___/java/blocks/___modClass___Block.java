/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This file is licensed under the terms of the GNU General Public License v3.0.
*/

package ___modId___.blocks;

import java.io.FileNotFoundException;
import java.util.List;

import ___modId___.___modClass___;
import cpw.mods.fml.common.LoaderException;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ___modClass___Block extends Block {
    public ___modClass___Block(String colorId) {
        super(___blockMaterial___);
        this.setBlockName("___modClass___" + colorId);
        this.setBlockTextureName(___modClass___.modid + ":" + colorId);
        this.setCreativeTab(___modClass___.___modClass___BlocksTab);
        this.setResistance(___blockResistance___);
        this.setHardness(___blockHardness___);
        this.setStepSound(___blockStepSound___);
    }
}
