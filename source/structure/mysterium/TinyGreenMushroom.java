package net.tslat.aoa3.structure.mysterium;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class TinyGreenMushroom extends AoAStructure {
	public TinyGreenMushroom() {
		super("TinyGreenMushroom");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		if (!world.getBlockState(basePos.down()).isOpaqueCube()) {
			world.setBlockState(basePos.down(), BlockRegister.MYSTERIUM_DIRT.getDefaultState());
		}

		if (rand.nextInt(3) == 0) {
			world.setBlockState(basePos, BlockRegister.SHROOM_STEM.getDefaultState());
			world.setBlockState(basePos.up(), BlockRegister.SHROOM_STEM.getDefaultState());
			world.setBlockState(basePos.up(2), BlockRegister.GREEN_SHROOM.getDefaultState());
		}
		else if (rand.nextBoolean()){
			world.setBlockState(basePos, BlockRegister.SHROOM_STEM.getDefaultState());
			world.setBlockState(basePos.up(), BlockRegister.GREEN_SHROOM.getDefaultState());
		}
		else {
			world.setBlockState(basePos, BlockRegister.GREEN_SHROOM.getDefaultState());
		}
	}
}
