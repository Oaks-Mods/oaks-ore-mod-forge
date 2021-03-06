package org.oakbricks.oakores.init;

import java.util.function.Supplier;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

@MethodsReturnNonnullByDefault
public enum OakOresArmorMaterials implements ArmorMaterial {

    PURPI_ARMOR("purpi", 10, new int[] { 4, 7, 9, 4 }, 17, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.of(ModItems.PURPI.get()));
    
	private static final int[] baseDurability = { 128, 144, 160, 112 };
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;

	OakOresArmorMaterials(String name, int durabilityMultiplier, int[] armorVal, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient.get();

	}

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.armorVal[slot.getIndex()];
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return baseDurability[slot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
    
}
