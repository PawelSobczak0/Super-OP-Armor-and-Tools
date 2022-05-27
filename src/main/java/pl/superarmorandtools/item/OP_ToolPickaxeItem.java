
package pl.superarmorandtools.item;

import pl.superarmorandtools.itemgroup.SuperArmorandToolsItemGroup;
import pl.superarmorandtools.SuperArmorAndToolsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

@SuperArmorAndToolsModElements.ModElement.Tag
public class OP_ToolPickaxeItem extends SuperArmorAndToolsModElements.ModElement {
	@ObjectHolder("super_armor_and_tools:op_tool_pickaxe")
	public static final Item block = null;

	public OP_ToolPickaxeItem(SuperArmorAndToolsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 128000;
			}

			public float getEfficiency() {
				return 128000f;
			}

			public float getAttackDamage() {
				return 127998f;
			}

			public int getHarvestLevel() {
				return 128000;
			}

			public int getEnchantability() {
				return 128000;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.COMMAND_BLOCK));
			}
		}, 1, 96f, new Item.Properties().group(SuperArmorandToolsItemGroup.tab)) {
		}.setRegistryName("op_tool_pickaxe"));
	}
}
