/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This file is licensed under the terms of the GNU General Public License v3.0.
*/

package ___modId___.blocks;

import ___modId___.___modClass___;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;

public class ___modClass___Slab extends BlockSlab {
    static ___modClass___ Color = new ___modClass___();
    private String colorId;

    public ___modClass___Slab(Block block, boolean fullBlock) {
        super(fullBlock, ___blockMaterial___);
        this.colorId = block.getUnlocalizedName().replaceAll(".*___modClass___", "");
        this.setBlockName("___modClass___" + this.colorId + "Slab");
        this.setBlockTextureName(Color.modid + ":" + this.colorId);
        if(!fullBlock) this.setCreativeTab(___modClass___.___modClass___SlabsTab);
        this.setResistance(___blockResistance___);
        this.setHardness(___blockHardness___);
        this.setStepSound(___blockStepSound___);
        this.setLightOpacity(0);
    }

    //getFullSlabName
    @Override
    public String func_150002_b(int i) {
        return super.getUnlocalizedName();
    }
}
