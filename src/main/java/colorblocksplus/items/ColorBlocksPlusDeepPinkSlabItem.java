/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemSlab
 *  net.minecraft.item.ItemStack
 */
package colorblocksplus.items;

import colorblocksplus.ColorBlocksPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;

public class ColorBlocksPlusDeepPinkSlabItem
extends ItemSlab {
    public ColorBlocksPlusDeepPinkSlabItem(Block block) {
        super(block, ColorBlocksPlus.ColorBlocksPlusDeepPinkHalfSlab, ColorBlocksPlus.ColorBlocksPlusDeepPinkFullSlab, false);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @SideOnly(value=Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool) {
        list.add("Color Blocks Plus - #F52887");
    }
}

