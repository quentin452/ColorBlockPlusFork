/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This file is licensed under the terms of the GNU General Public License v3.0.
*/

package ___modId___;

import ___modId___.*;
import ___modId___.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ColorRegistrations {
    public static void addRegistrations(___modClass___ m) {

        // Registers the Blocks in Minecraft
        GameRegistry.registerBlock(m.___modClass______colorId___,         ___modClass___BlockItem.class, "___colorId___");
        // Registers the Stairs in Minecraft
        GameRegistry.registerBlock(m.___modClass______colorId___Stair,    ___modClass___BlockItem.class, "___colorId___Stair");
        // Registers the Half Slabs in Minecraft
        GameRegistry.registerBlock(m.___modClass______colorId___HalfSlab, ___modClass______colorId___SlabItem.class,  "___colorId___HalfSlab");
        // Registers the Full Slabs in Minecraft
        GameRegistry.registerBlock(m.___modClass______colorId___FullSlab, ___modClass______colorId___SlabItem.class,  "___colorId___FullSlab");
    }
}
