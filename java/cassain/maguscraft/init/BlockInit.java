package cassain.maguscraft.init;

import java.util.ArrayList;
import java.util.List;

import cassain.maguscraft.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block BLOCK_MAGUSIUM = new BlockBase("block_magusium", Material.IRON);
}