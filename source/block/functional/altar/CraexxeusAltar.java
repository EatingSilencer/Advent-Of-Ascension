package net.tslat.aoa3.block.functional.altar;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.entity.boss.craexxeus.EntityCraexxeus;
import net.tslat.aoa3.utils.StringUtil;

public class CraexxeusAltar extends BossAltarBlock {
	public CraexxeusAltar() {
		super("CraexxeusAltar", "craexxeus_altar");
	}

	@Override
	protected void doActivationEffect(EntityPlayer player, EnumHand hand, IBlockState state, BlockPos blockPos) {
		EntityCraexxeus craexxeus = new EntityCraexxeus(player.world);

		int offsetX = player.getRNG().nextBoolean() ? -11 : 11;
		int offsetZ = player.getRNG().nextBoolean() ? -11 : 11;

		craexxeus.setLocationAndAngles(blockPos.getX() + offsetX, blockPos.getY(), blockPos.getZ() + offsetZ, 0, 0);
		player.world.spawnEntity(craexxeus);
		sendSpawnMessage(player, StringUtil.getLocaleWithArguments("message.mob.craexxeus.spawn", player.getDisplayNameString()), blockPos);
	}

	@Override
	protected Item getActivationItem() {
		return ItemRegister.ANCIENT_RING;
	}
}
