/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This file is licensed under the terms of the GNU General Public License v3.0.
*/

package ___modId___;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

import ___modId___.blocks.___modClass___Block;
import ___modId___.blocks.___modClass___Slab;
import ___modId___.blocks.___modClass___Stair;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.MapColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@Mod(modid = "___modId___", name = "___modName___", version = "___modVersion___")
public class ___modClass___ {
    // modid = ___modClass___
    public static final String modid = "___modId___";

    // The instance of your mod that Forge uses.
    @Instance("___modClass___")
    public static ___modClass___ instance;

    // Color Map
    public static final Map<String, String> COLOR_MAP;
    static {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("___colorId___", "___colorCode___");
        COLOR_MAP = Collections.unmodifiableMap(map);
    }

    // Blocks
    public static Block       ___modClass______colorId___;
    // Stairs
    public static BlockStairs ___modClass______colorId___Stair;
    // Half Slabs
    public static BlockSlab   ___modClass______colorId___HalfSlab;
    // Full Slabs
    public static BlockSlab   ___modClass______colorId___FullSlab;

    // Creative tab
    public static final CreativeTabs ___modClass___BlocksTab = new CreativeTabs("___modClass___BlocksTab") {
        public Item getTabIconItem() {
            return Item.getItemFromBlock(___modClass______modIcon___);
        }
    };
    public static final CreativeTabs ___modClass___StairsTab = new CreativeTabs("___modClass___StairsTab") {
        public Item getTabIconItem() {
            return Item.getItemFromBlock(___modClass______modIcon___Stair);
        }
    };
    public static final CreativeTabs ___modClass___SlabsTab = new CreativeTabs("___modClass___SlabsTab") {
        public Item getTabIconItem() {
            return Item.getItemFromBlock(___modClass______modIcon___HalfSlab);
        }
    };

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event) {
        // Defines the Blocks in Minecraft
        ___modClass______colorId___         = new ___modClass___Block("___colorId___");
        // Defines the Stairs in Minecraft
        ___modClass______colorId___Stair    = new ___modClass___Stair(___modClass______colorId___);
        // Defines the Half Slabs in Minecraft
        ___modClass______colorId___HalfSlab = new ___modClass___Slab(___modClass______colorId___, false);
        // Defines the Full Slabs in Minecraft
        ___modClass______colorId___FullSlab = new ___modClass___Slab(___modClass______colorId___, true);

        ColorRegistrations.addRegistrations(this);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}

