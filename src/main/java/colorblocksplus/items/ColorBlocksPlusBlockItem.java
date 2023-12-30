/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.block.Block
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 */
package colorblocksplus.items;

import colorblocksplus.ColorBlocksPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ColorBlocksPlusBlockItem
extends ItemBlock {
    private String colorId;
    private String colorCode;

    public ColorBlocksPlusBlockItem(Block block) {
        super(block);
        this.colorId = block.getUnlocalizedName().replaceAll(".*ColorBlocksPlus|Stair", "");
        this.colorCode = ColorBlocksPlus.COLOR_MAP.get(this.colorId);
    }

    @SideOnly(value=Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool) {
        list.add("Color Blocks Plus - " + this.colorCode);
    }
}

