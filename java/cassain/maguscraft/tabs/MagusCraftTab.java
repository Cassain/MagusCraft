package cassain.maguscraft.tabs;

import cassain.maguscraft.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MagusCraftTab extends CreativeTabs
{
	public MagusCraftTab(String label)
	{ 
		super("MagusCraft");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.INGOT_MAGUSIUM);
	}
}
