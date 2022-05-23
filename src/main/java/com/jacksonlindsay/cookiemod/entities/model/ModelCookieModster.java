package com.jacksonlindsay.cookiemod.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCookieModster extends ModelBase {
    public ModelRenderer ChickenWingRight;
    public ModelRenderer ChickenLegLeft;
    public ModelRenderer ChickenWingLeft;
    public ModelRenderer ChickenBody;
    public ModelRenderer ChickenLegRight;

    public ModelCookieModster() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.ChickenWingRight = new ModelRenderer(this, 24, 13);
        this.ChickenWingRight.setRotationPoint(-4.0F, 13.0F, 0.0F);
        this.ChickenWingRight.addBox(0.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F);
        this.ChickenLegLeft = new ModelRenderer(this, 26, 0);
        this.ChickenLegLeft.setRotationPoint(1.0F, 19.0F, 1.0F);
        this.ChickenLegLeft.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.ChickenBody = new ModelRenderer(this, 0, 9);
        this.ChickenBody.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.ChickenBody.addBox(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(ChickenBody, 1.5707963267948966F, 0.0F, 0.0F);
        this.ChickenLegRight = new ModelRenderer(this, 26, 0);
        this.ChickenLegRight.setRotationPoint(-2.0F, 19.0F, 1.0F);
        this.ChickenLegRight.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.ChickenWingLeft = new ModelRenderer(this, 24, 13);
        this.ChickenWingLeft.setRotationPoint(4.0F, 13.0F, 0.0F);
        this.ChickenWingLeft.addBox(-1.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.ChickenWingRight.render(f5);
        this.ChickenLegLeft.render(f5);
        this.ChickenBody.render(f5);
        this.ChickenLegRight.render(f5);
        this.ChickenWingLeft.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
