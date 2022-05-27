
package pl.superarmorandtools.itemgroup;

import pl.superarmorandtools.SuperArmorAndToolsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

@SuperArmorAndToolsModElements.ModElement.Tag
public class SuperArmorandToolsItemGroup extends SuperArmorAndToolsModElements.ModElement {
	public SuperArmorandToolsItemGroup(SuperArmorAndToolsModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsuper_armorand_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.COMMAND_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
