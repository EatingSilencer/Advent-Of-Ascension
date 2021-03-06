package net.tslat.aoa3.client.render.entities.layers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.entity.minions.EntityFriendlyCreeper;

@SideOnly(Side.CLIENT)
public class RenderLayerFriendlyCreeperCharge implements LayerRenderer<EntityLivingBase> {
	private static final ResourceLocation armourTexture = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
	private final ModelBase expandedModel;
	private final RenderLiving renderer;

	public RenderLayerFriendlyCreeperCharge(RenderLiving entityRenderer, ModelBase expandedEntityModel) {
		this.renderer = entityRenderer;
		this.expandedModel = expandedEntityModel;
	}

	@Override
	public void doRenderLayer(EntityLivingBase entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if (entity instanceof EntityFriendlyCreeper && ((EntityFriendlyCreeper)entity).getPowered()) {
			boolean invisible = entity.isInvisible();

			GlStateManager.depthMask(!invisible);
			this.renderer.bindTexture(armourTexture);
			GlStateManager.matrixMode(5890);
			GlStateManager.loadIdentity();

			float timeMod = (float)entity.ticksExisted + partialTicks;

			GlStateManager.translate(timeMod * 0.01F, timeMod * 0.01F, 0.0F);
			GlStateManager.matrixMode(5888);
			GlStateManager.enableBlend();
			GlStateManager.color(0.5F, 0.5F, 0.5F, 1.0F);
			GlStateManager.disableLighting();
			GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
			renderer.getMainModel().setModelAttributes(this.renderer.getMainModel());
			Minecraft.getMinecraft().entityRenderer.setupFogColor(true);
			renderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
			Minecraft.getMinecraft().entityRenderer.setupFogColor(false);
			GlStateManager.matrixMode(5890);
			GlStateManager.loadIdentity();
			GlStateManager.matrixMode(5888);
			GlStateManager.enableLighting();
			GlStateManager.disableBlend();
			GlStateManager.depthMask(invisible);
		}
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}
