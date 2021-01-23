package com.rafacost3d.usrg.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

import static com.rafacost3d.usrg.blocks.ModBlocks.*;

public class GrassGeneratorTile extends BaseGeneratorTile {

	public static final Block GENERATION_BLOCK = Blocks.GRASS_BLOCK;

    public GrassGeneratorTile() {
        super(GRASSGENERATOR_TILE);
    }

    @Override
    public void tick() {
        if(tickcount % tickspergencycle == 0) {
            ItemStack stack = new ItemStack(GENERATION_BLOCK, 1);
            ItemHandlerHelper.insertItemStacked(getHandler(),stack, false);
            tickcount = 1;
        }
        tickcount += 1;
    }

}
