/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This file is licensed under the terms of the GNU General Public License v3.0.
*/

package ___modId___.items;

import java.util.List;
import java.util.Map;

import ___modId___.___modClass___;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class ___modClass___BlockItem extends ItemBlock {
    private String colorId;
    private String colorCode;

    public ___modClass___BlockItem(Block block) {
        super(block);
        this.colorId = block.getUnlocalizedName().replaceAll(".*___modClass___|Stair", "");
        this.colorCode = ___modClass___.COLOR_MAP.get(this.colorId);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool) {
        list.add("___blockInfo___" + this.colorCode);
    }
}
