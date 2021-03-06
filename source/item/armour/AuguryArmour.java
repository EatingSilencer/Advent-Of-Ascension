package net.tslat.aoa3.item.armour;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.item.SkillItem;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.ItemUtil;
import net.tslat.aoa3.utils.player.PlayerDataManager;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.List;

import static net.tslat.aoa3.common.registration.MaterialsRegister.ARMOUR_AUGURY;

public class AuguryArmour extends AdventArmour implements SkillItem {
	public AuguryArmour(String name, String registryName, EntityEquipmentSlot slot) {
		super(ARMOUR_AUGURY, name, registryName, slot);
	}

	@Override
	public void onEffectTick(PlayerDataManager plData, @Nullable HashSet<EntityEquipmentSlot> slots) {
		plData.stats().regenResource(Enums.Resources.SOUL, 0.01f);
	}

	@Override
	public Enums.ArmourSets setType() {
		return Enums.ArmourSets.AUGURY;
	}

	@Override
	public Enums.Skills getSkill() {
		return Enums.Skills.AUGURY;
	}

	@Override
	public int getLevelReq() {
		return 100;
	}

	@Override
	public void addBuffs(PlayerDataManager.PlayerBuffs plBuffs, @Nullable EntityEquipmentSlot slot) {
		if (slot == null)
			plBuffs.addXpModifier(Enums.Skills.AUGURY, 0.3f);
	}

	@Override
	public void removeBuffs(PlayerDataManager.PlayerBuffs plBuffs, @Nullable EntityEquipmentSlot slot) {
		if (slot == null)
			plBuffs.removeXpModifier(Enums.Skills.AUGURY, 0.3f);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(ItemUtil.getFormattedLevelRestrictedDescriptionText(Enums.Skills.AUGURY, 100));
	}
}
