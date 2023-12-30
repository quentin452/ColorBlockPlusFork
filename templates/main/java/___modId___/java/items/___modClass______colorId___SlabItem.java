/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This file is licensed under the terms of the GNU General Public License v3.0.
*/

package ___modId___.items;

import java.util.List;

import ___modId___.___modClass___;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class ___modClass______colorId___SlabItem extends ItemSlab {
    public ___modClass______colorId___SlabItem(Block block) {
        super(block, (BlockSlab) ___modClass___.___modClass______colorId___HalfSlab, (BlockSlab) ___modClass___.___modClass______colorId___FullSlab, false);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool) {
        list.add("___blockInfo______colorCode___");
    }
}
