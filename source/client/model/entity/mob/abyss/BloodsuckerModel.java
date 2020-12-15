package net.tslat.aoa3.client.model.entity.mob.abyss;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class BloodsuckerModel extends EntityModel<MobEntity> {
	private final ModelRenderer body;
	private final ModelRenderer leg1p1;
	private final ModelRenderer leg6p1;
	private final ModelRenderer leg2p1;
	private final ModelRenderer leg5p1;
	private final ModelRenderer leg1p2;
	private final ModelRenderer leg5p2;
	private final ModelRenderer leg6p2;
	private final ModelRenderer leg2p2;
	private final ModelRenderer head1;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer leg4p2;
	private final ModelRenderer leg4p1;
	private final ModelRenderer leg3p1;
	private final ModelRenderer leg3p2;
	private final ModelRenderer leg2p3;
	private final ModelRenderer leg4p3;
	private final ModelRenderer leg6p3;
	private final ModelRenderer leg1p3;
	private final ModelRenderer leg3p3;
	private final ModelRenderer leg5p3;

	public BloodsuckerModel() {
		textureWidth = 128;
		textureHeight = 32;
		(body = new ModelRenderer(this, 34, 0)).addBox(-5.0f, -10.0f, -7.0f, 10, 26, 5);
		body.setRotationPoint(0.0f, 8.0f, 3.0f);
		body.setTextureSize(128, 32);
		body.mirror = true;
		setRotation(body, 1.570796f, 0.0f, 0.0f);
		(leg1p1 = new ModelRenderer(this, 91, 2)).addBox(-8.0f, -2.0f, -2.0f, 8, 3, 4);
		leg1p1.setRotationPoint(-3.0f, 9.0f, -5.0f);
		leg1p1.setTextureSize(128, 32);
		leg1p1.mirror = true;
		setRotation(leg1p1, 0.0f, 0.0f, 0.0f);
		(leg6p1 = new ModelRenderer(this, 91, 2)).addBox(0.0f, -2.0f, -2.0f, 8, 3, 4);
		leg6p1.setRotationPoint(3.0f, 9.0f, 17.0f);
		leg6p1.setTextureSize(128, 32);
		leg6p1.mirror = true;
		setRotation(leg6p1, 0.0f, 0.0f, 0.0f);
		(leg2p1 = new ModelRenderer(this, 91, 2)).addBox(0.0f, -2.0f, -2.0f, 8, 3, 4);
		leg2p1.setRotationPoint(3.0f, 9.0f, -5.0f);
		leg2p1.setTextureSize(128, 32);
		leg2p1.mirror = true;
		setRotation(leg2p1, 0.0f, 0.0f, 0.0f);
		(leg5p1 = new ModelRenderer(this, 91, 2)).addBox(-8.0f, -2.0f, -2.0f, 8, 3, 4);
		leg5p1.setRotationPoint(-3.0f, 9.0f, 17.0f);
		leg5p1.setTextureSize(128, 32);
		leg5p1.mirror = true;
		setRotation(leg5p1, 0.0f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 86, 14)).addBox(-10.0f, 1.0f, 0.0f, 2, 14, 0);
		leg1p2.setRotationPoint(-3.0f, 9.0f, -5.0f);
		leg1p2.setTextureSize(128, 32);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		(leg5p2 = new ModelRenderer(this, 86, 14)).addBox(-10.0f, 1.0f, 0.0f, 2, 14, 0);
		leg5p2.setRotationPoint(-3.0f, 9.0f, 17.0f);
		leg5p2.setTextureSize(128, 32);
		leg5p2.mirror = true;
		setRotation(leg5p2, 0.0f, 0.0f, 0.0f);
		(leg6p2 = new ModelRenderer(this, 118, 14)).addBox(8.0f, 1.0f, 0.0f, 2, 14, 0);
		leg6p2.setRotationPoint(3.0f, 9.0f, 17.0f);
		leg6p2.setTextureSize(128, 32);
		leg6p2.mirror = true;
		setRotation(leg6p2, 0.0f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 118, 14)).addBox(8.0f, 1.0f, 0.0f, 2, 14, 0);
		leg2p2.setRotationPoint(3.0f, 9.0f, -5.0f);
		leg2p2.setTextureSize(128, 32);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		(head1 = new ModelRenderer(this, 0, 15)).addBox(1.0f, 1.0f, -12.0f, 1, 1, 6);
		head1.setRotationPoint(0.0f, 12.0f, -6.0f);
		head1.setTextureSize(128, 32);
		head1.mirror = true;
		setRotation(head1, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -8.0f, 8, 5, 8);
		head2.setRotationPoint(0.0f, 12.0f, -6.0f);
		head2.setTextureSize(128, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 0, 15)).addBox(-2.0f, 1.0f, -12.0f, 1, 1, 6);
		head3.setRotationPoint(0.0f, 12.0f, -6.0f);
		head3.setTextureSize(128, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 118, 14)).addBox(8.0f, 1.0f, 0.0f, 2, 14, 0);
		leg4p2.setRotationPoint(3.0f, 9.0f, 6.0f);
		leg4p2.setTextureSize(128, 32);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		(leg4p1 = new ModelRenderer(this, 91, 2)).addBox(0.0f, -2.0f, -2.0f, 8, 3, 4);
		leg4p1.setRotationPoint(3.0f, 9.0f, 6.0f);
		leg4p1.setTextureSize(128, 32);
		leg4p1.mirror = true;
		setRotation(leg4p1, 0.0f, 0.0f, 0.0f);
		(leg3p1 = new ModelRenderer(this, 91, 2)).addBox(-8.0f, -2.0f, -2.0f, 8, 3, 4);
		leg3p1.setRotationPoint(-3.0f, 9.0f, 6.0f);
		leg3p1.setTextureSize(128, 32);
		leg3p1.mirror = true;
		setRotation(leg3p1, 0.0f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 86, 14)).addBox(-10.0f, 1.0f, 0.0f, 2, 14, 0);
		leg3p2.setRotationPoint(-3.0f, 9.0f, 6.0f);
		leg3p2.setTextureSize(128, 32);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		(leg2p3 = new ModelRenderer(this, 67, 14)).addBox(4.0f, 1.0f, -2.0f, 4, 14, 4);
		leg2p3.setRotationPoint(3.0f, 9.0f, -5.0f);
		leg2p3.setTextureSize(128, 32);
		leg2p3.mirror = true;
		setRotation(leg2p3, 0.0f, 0.0f, 0.0f);
		(leg4p3 = new ModelRenderer(this, 67, 14)).addBox(4.0f, 1.0f, -2.0f, 4, 14, 4);
		leg4p3.setRotationPoint(3.0f, 9.0f, 6.0f);
		leg4p3.setTextureSize(128, 32);
		leg4p3.mirror = true;
		setRotation(leg4p3, 0.0f, 0.0f, 0.0f);
		(leg6p3 = new ModelRenderer(this, 67, 14)).addBox(4.0f, 1.0f, -2.0f, 4, 14, 4);
		leg6p3.setRotationPoint(3.0f, 9.0f, 17.0f);
		leg6p3.setTextureSize(128, 32);
		leg6p3.mirror = true;
		setRotation(leg6p3, 0.0f, 0.0f, 0.0f);
		(leg1p3 = new ModelRenderer(this, 67, 14)).addBox(-8.0f, 1.0f, -2.0f, 4, 14, 4);
		leg1p3.setRotationPoint(-3.0f, 9.0f, -5.0f);
		leg1p3.setTextureSize(128, 32);
		leg1p3.mirror = true;
		setRotation(leg1p3, 0.0f, 0.0f, 0.0f);
		(leg3p3 = new ModelRenderer(this, 67, 14)).addBox(-8.0f, 1.0f, -2.0f, 4, 14, 4);
		leg3p3.setRotationPoint(-3.0f, 9.0f, 6.0f);
		leg3p3.setTextureSize(128, 32);
		leg3p3.mirror = true;
		setRotation(leg3p3, 0.0f, 0.0f, 0.0f);
		(leg5p3 = new ModelRenderer(this, 67, 14)).addBox(-8.0f, 1.0f, -2.0f, 4, 14, 4);
		leg5p3.setRotationPoint(-3.0f, 9.0f, 17.0f);
		leg5p3.setTextureSize(128, 32);
		leg5p3.mirror = true;
		setRotation(leg5p3, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1p1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg6p1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2p1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg5p1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg5p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg6p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4p1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3p1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3p2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2p3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4p3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg6p3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1p3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3p3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg5p3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head1.rotateAngleY = netHeadYaw / 57.295776f;
		head1.rotateAngleX = headPitch / 54.11268f;
		head2.rotateAngleY = netHeadYaw / 57.295776f;
		head2.rotateAngleX = headPitch / 54.11268f;
		head3.rotateAngleY = netHeadYaw / 57.295776f;
		head3.rotateAngleX = headPitch / 54.11268f;
		leg1p1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1p1.rotateAngleY = 0.0f;
		leg3p1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3p1.rotateAngleY = 0.0f;
		leg5p1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg5p1.rotateAngleY = 0.0f;
		leg1p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1p2.rotateAngleY = 0.0f;
		leg3p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3p2.rotateAngleY = 0.0f;
		leg5p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg5p2.rotateAngleY = 0.0f;
		leg1p3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1p3.rotateAngleY = 0.0f;
		leg3p3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3p3.rotateAngleY = 0.0f;
		leg5p3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg5p3.rotateAngleY = 0.0f;
		leg2p1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4p1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg6p1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg2p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg6p2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg2p3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4p3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg6p3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}
}