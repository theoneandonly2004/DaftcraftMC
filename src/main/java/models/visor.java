// Date: 17/06/2014 22:00:01
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class visor extends ModelBiped
{
  //fields
    ModelRenderer visor;
    ModelRenderer headbandright;
    ModelRenderer headbandleft;
    ModelRenderer headbandback;
    ModelRenderer visor_outsidetopside;
    ModelRenderer visor_outsidebottomside;
    ModelRenderer visor_outside_leftside;
    ModelRenderer visor_outsiderightside;
  
  public visor ()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      visor = new ModelRenderer(this, 36, 5);
      visor.addBox(-4F, -8F, -8F, 10, 2, 1);
      visor.setRotationPoint(-1F, 3.6F, 3F);
      visor.setTextureSize(64, 64);
      visor.mirror = true;
      setRotation(visor, 0F, 0F, 0F);
      headbandright = new ModelRenderer(this, 36, 0);
      headbandright.addBox(-4F, -8F, -8F, 9, 2, 1);
      headbandright.setRotationPoint(3F, 3.6F, 1F);
      headbandright.setTextureSize(64, 64);
      headbandright.mirror = true;
      setRotation(headbandright, 0F, 1.570796F, 0F);
      headbandleft = new ModelRenderer(this, 36, 0);
      headbandleft.addBox(4F, -8F, -8F, 9, 2, 1);
      headbandleft.setRotationPoint(12F, 3.6F, 9F);
      headbandleft.setTextureSize(64, 64);
      headbandleft.mirror = true;
      setRotation(headbandleft, 0F, 1.570796F, 0F);
      headbandback = new ModelRenderer(this, 36, 0);
      headbandback.addBox(4F, -8F, -8F, 10, 2, 1);
      headbandback.setRotationPoint(-9F, 3.6F, 12F);
      headbandback.setTextureSize(64, 64);
      headbandback.mirror = true;
      setRotation(headbandback, 0F, 0F, 0F);
      visor_outsidetopside = new ModelRenderer(this, 36, 12);
      visor_outsidetopside.addBox(-4F, -8F, -8F, 12, 1, 1);
      visor_outsidetopside.setRotationPoint(-2F, 2.6F, 3F);
      visor_outsidetopside.setTextureSize(64, 64);
      visor_outsidetopside.mirror = true;
      setRotation(visor_outsidetopside, 0F, 0F, 0F);
      visor_outsidebottomside = new ModelRenderer(this, 36, 12);
      visor_outsidebottomside.addBox(-4F, -8F, -8F, 12, 1, 1);
      visor_outsidebottomside.setRotationPoint(-2F, 5.6F, 3F);
      visor_outsidebottomside.setTextureSize(64, 64);
      visor_outsidebottomside.mirror = true;
      setRotation(visor_outsidebottomside, 0F, 0F, 0F);
      visor_outside_leftside = new ModelRenderer(this, 31, 12);
      visor_outside_leftside.addBox(-4F, -8F, -8F, 1, 2, 1);
      visor_outside_leftside.setRotationPoint(-2F, 3.6F, 3F);
      visor_outside_leftside.setTextureSize(64, 64);
      visor_outside_leftside.mirror = true;
      setRotation(visor_outside_leftside, 0F, 0F, 0F);
      visor_outsiderightside = new ModelRenderer(this, 31, 12);
      visor_outsiderightside.addBox(-4F, -8F, -8F, 1, 2, 1);
      visor_outsiderightside.setRotationPoint(9F, 3.6F, 3F);
      visor_outsiderightside.setTextureSize(64, 64);
      visor_outsiderightside.mirror = true;
      setRotation(visor_outsiderightside, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    visor.render(f5);
    headbandright.render(f5);
    headbandleft.render(f5);
    headbandback.render(f5);
    visor_outsidetopside.render(f5);
    visor_outsidebottomside.render(f5);
    visor_outside_leftside.render(f5);
    visor_outsiderightside.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5,entity);
  }

}
