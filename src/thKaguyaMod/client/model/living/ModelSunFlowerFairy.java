// Date: 2013/06/25 19:04:21
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package thKaguyaMod.client.model.living;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import thKaguyaMod.entity.living.EntityTHFairy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelSunFlowerFairy extends ModelBase
{
  //fields
    ModelRenderer bipedBody;
    ModelRenderer bipedRightArm;
    ModelRenderer bipedLeftArm;
    ModelRenderer bipedRightLeg;
    ModelRenderer bipedLeftLeg;
    ModelRenderer skirtTop;
    ModelRenderer skirtBottom;
    ModelRenderer leftWing;
    ModelRenderer rightWing;
    ModelRenderer himawari1;
    ModelRenderer himawari2;
    ModelRenderer bipedHead;
    ModelRenderer longHair;
    ModelRenderer rightRibbon;
    ModelRenderer rightTail;
    ModelRenderer leftRibbon;
    ModelRenderer leftTail;
  
  public ModelSunFlowerFairy()
  {
    textureWidth = 128;
    textureHeight = 64;

    bipedBody = new ModelRenderer(this, 32, 8);
    bipedBody.addBox(-3F, 0F, -2F, 6, 7, 4);
    bipedBody.setRotationPoint(0F, 5F, 0F);
    bipedBody.setTextureSize(128, 64);
    bipedBody.mirror = true;
    setRotation(bipedBody, 0F, 0F, 0F);
    bipedRightArm = new ModelRenderer(this, 48, 0);
    bipedRightArm.addBox(-1F, -1F, -1F, 2, 8, 2);
    bipedRightArm.setRotationPoint(-4F, 6F, 0F);
    bipedRightArm.setTextureSize(128, 64);
    bipedRightArm.mirror = true;
    setRotation(bipedRightArm, -0.7679449F, 0F, -0.6457718F);
    bipedLeftArm = new ModelRenderer(this, 56, 0);
    bipedLeftArm.addBox(-1F, -1F, -1F, 2, 8, 2);
    bipedLeftArm.setRotationPoint(4F, 6F, 0F);
    bipedLeftArm.setTextureSize(128, 64);
    bipedLeftArm.mirror = true;
    setRotation(bipedLeftArm, -0.7679449F, 0F, 0.6457718F);
    bipedRightLeg = new ModelRenderer(this, 50, 16);
    bipedRightLeg.addBox(-1F, 0F, -2F, 3, 11, 4);
    bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
    bipedRightLeg.setTextureSize(128, 64);
    bipedRightLeg.mirror = true;
    setRotation(bipedRightLeg, 0F, 0F, 0F);
    bipedLeftLeg = new ModelRenderer(this, 50, 16);
    bipedLeftLeg.addBox(-2F, 0F, -2F, 3, 11, 4);
    bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
    bipedLeftLeg.setTextureSize(128, 64);
    bipedLeftLeg.mirror = true;
    setRotation(bipedLeftLeg, 0F, 0F, 0F);
    skirtTop = new ModelRenderer(this, 0, 16);
    skirtTop.addBox(-4F, 5F, -4F, 8, 4, 8);
    skirtTop.setRotationPoint(0F, 0F, 0F);
    skirtTop.setTextureSize(128, 64);
    skirtTop.mirror = true;
    setRotation(skirtTop, 0F, 0F, 0F);
    skirtBottom = new ModelRenderer(this, 32, 32);
    skirtBottom.addBox(-5F, 0F, -5F, 10, 6, 10);
    skirtBottom.setRotationPoint(0F, 9F, 0F);
    skirtBottom.setTextureSize(128, 64);
    skirtBottom.mirror = true;
    setRotation(skirtBottom, 0F, 0F, 0F);
    //leftWing.mirror = true;
    leftWing = new ModelRenderer(this, 64, 0);
    leftWing.addBox(-1F, -16F, 0F, 20, 26, 1);
    leftWing.setRotationPoint(2F, 3F, 2F);
    leftWing.setTextureSize(128, 64);
    leftWing.mirror = false;
    setRotation(leftWing, 0F, -0.4886922F, 0.0167304F);
    leftWing.mirror = false;
    rightWing = new ModelRenderer(this, 72, 32);
    rightWing.addBox(-1F, -16F, 0F, 20, 26, 1);
    rightWing.setRotationPoint(-2F, 3F, 2F);
    rightWing.setTextureSize(128, 64);
    rightWing.mirror = false;
    setRotation(rightWing, 0F, -2.6529F, 0.0167304F);
    himawari1 = new ModelRenderer(this, 0, 32);
    himawari1.addBox(-7F, -20F, 0F, 12, 31, 1);
    himawari1.setRotationPoint(0F, 6F, -2F);
    himawari1.setTextureSize(128, 64);
    himawari1.mirror = true;
    setRotation(himawari1, 0.4089647F, -0.7435722F, 0.3666439F);
    himawari2 = new ModelRenderer(this, 0, 32);
    himawari2.addBox(-7F, -20F, 0F, 12, 31, 1);
    himawari2.setRotationPoint(-1F, 6F, -2F);
    himawari2.setTextureSize(128, 64);
    himawari2.mirror = true;
    setRotation(himawari2, 0.2230717F, -0.669215F, 0.2551081F);
    bipedHead = new ModelRenderer(this, 0, 0);
    bipedHead.addBox(-4F, -8F, -4F, 8, 8, 8);
    bipedHead.setRotationPoint(0F, 5F, 0F);
    bipedHead.setTextureSize(128, 64);
    bipedHead.mirror = true;
    setRotation(bipedHead, 0F, 0F, 0F);
    longHair = new ModelRenderer(this, 24, 0);
    longHair.addBox(-4F, 4F, -3F, 8, 5, 3);
    longHair.setRotationPoint(0F, -5F, 4F);
    longHair.setTextureSize(128, 64);
    longHair.mirror = true;
    setRotation(longHair, 0F, 0F, 0F);
    rightRibbon = new ModelRenderer(this, 32, 19);
    rightRibbon.addBox(-3F, -2F, -1F, 5, 4, 1);
    rightRibbon.setRotationPoint(-4F, -7F, 0F);
    rightRibbon.setTextureSize(128, 64);
    rightRibbon.mirror = true;
    setRotation(rightRibbon, -0.4712389F, 1.570796F, 0F);
    rightTail = new ModelRenderer(this, 32, 24);
    rightTail.addBox(-2F, -1F, -2F, 3, 8, 2);
    rightTail.setRotationPoint(-5F, -7F, 0F);
    rightTail.setTextureSize(128, 64);
    rightTail.mirror = true;
    setRotation(rightTail, -0.2617994F, 1.570796F, 0F);
    leftRibbon = new ModelRenderer(this, 32, 19);
    leftRibbon.addBox(-3F, -2F, 0F, 5, 4, 1);
    leftRibbon.setRotationPoint(4F, -7F, 0F);
    leftRibbon.setTextureSize(128, 64);
    leftRibbon.mirror = true;
    setRotation(leftRibbon, 0.4712389F, 1.570796F, 0F);
    leftTail = new ModelRenderer(this, 32, 24);
    leftTail.addBox(-2F, -1F, 0F, 3, 8, 2);
    leftTail.setRotationPoint(5F, -7F, 0F);
    leftTail.setTextureSize(128, 64);
    leftTail.mirror = true;
    setRotation(leftTail, 0.2617994F, 1.570796F, 0F);
    
    bipedBody.addChild(rightWing);
    bipedBody.addChild(leftWing);
    bipedBody.addChild(skirtTop);
    skirtTop.addChild(skirtBottom);
    bipedLeftArm.addChild(himawari1);
    bipedLeftArm.addChild(himawari2);
    
    bipedHead.addChild(longHair);
    bipedHead.addChild(rightRibbon);
    bipedHead.addChild(leftRibbon);
    bipedHead.addChild(rightTail);
    bipedHead.addChild(leftTail);
  }
  
  @Override
  public void render(Entity entity, float movement, float far, float tick, float yaw, float pitch, float size)
  {
	  super.render(entity, movement, far, tick, yaw, pitch, size);
	  setRotationAngles(movement, far, tick, yaw, pitch, size, entity);


	  
	    bipedBody.render(size);
	    bipedRightArm.render(size);
	    bipedLeftArm.render(size);
	    bipedRightLeg.render(size);
	    bipedLeftLeg.render(size);
	    bipedHead.render(size);
	    

  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  @Override
  public void setRotationAngles(float movement, float far, float tick, float yaw, float pitch, float size, Entity entity)
  {
    super.setRotationAngles(movement, far, tick, yaw, pitch, size, entity);
    EntityTHFairy thFairy = (EntityTHFairy)entity;
    
  	this.bipedHead.rotateAngleY = yaw / (180F / (float)Math.PI);
    this.bipedHead.rotateAngleX = pitch / (180F / (float)Math.PI);
  	this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(onGround) * (float)Math.PI * 2.0F) * 0.2F;
  	this.skirtTop.rotateAngleX = 0F;
  	
    if (this.isRiding)
    {
        this.bipedRightArm.rotateAngleX = -((float)Math.PI / 5F);
        this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 5F);
        this.bipedRightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.bipedLeftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.bipedRightLeg.rotateAngleY = ((float)Math.PI / 14F);
        this.bipedLeftLeg.rotateAngleY = -((float)Math.PI / 14F);
        this.bipedRightLeg.rotateAngleZ = ((float)Math.PI / 14F);
        this.bipedLeftLeg.rotateAngleZ = -((float)Math.PI / 14F);
        
        this.skirtTop.rotateAngleX += -((float)Math.PI / 5F);
    }
    else
    {
  	
	  	if(thFairy.getFlyingHeight() == 0)
	  	{
	  		bipedRightLeg.rotateAngleX = MathHelper.cos(movement) * 0.7F * far;
	  		bipedLeftLeg.rotateAngleX = MathHelper.cos(movement + (float)Math.PI) * 0.7F * far;
		  	bipedRightLeg.rotateAngleZ = 0F; 
		  	bipedLeftLeg.rotateAngleZ = 0F;
		  	
		  	if(movement > 0F)
		  	{
		        this.bipedRightArm.rotateAngleX = MathHelper.cos(movement + (float)Math.PI) * 2.0F * far * 0.5F;
		        this.bipedLeftArm.rotateAngleX = MathHelper.cos(movement) * 2.0F * far * 0.5F;
		        bipedRightArm.rotateAngleY = -10F / 180F * (float)Math.PI;
		        bipedRightArm.rotateAngleZ = 20F / 180F * (float)Math.PI;
		        bipedLeftArm.rotateAngleY = -bipedRightArm.rotateAngleY;
		        bipedLeftArm.rotateAngleZ = -bipedRightArm.rotateAngleZ;
		  	}
		  	else
		  	{
		  	  	bipedRightArm.rotateAngleX = -0.7F - MathHelper.sin(tick  / 10F) * 0.1F;
		  	  	bipedRightArm.rotateAngleY = 0.0F;
		  	  	bipedRightArm.rotateAngleZ = -0.6457718F;
		  	  	bipedLeftArm.rotateAngleX = bipedRightArm.rotateAngleX;
		  	  	bipedLeftArm.rotateAngleY = 0.0F;
		  	  	bipedLeftArm.rotateAngleZ = 0.6457718F;
	
		  	}
	  	}
	  	else
	  	{
	  		
	  	  	bipedRightLeg.rotateAngleZ = Math.abs(MathHelper.sin(tick  / 10F) * 0.1F); 
	  	  	bipedLeftLeg.rotateAngleZ = -bipedRightLeg.rotateAngleZ;
	  	  	bipedRightLeg.rotateAngleX = Math.abs(MathHelper.sin(tick  / 10F) * 0.2F); 
	  	  	bipedLeftLeg.rotateAngleX = bipedRightLeg.rotateAngleZ;
	  	  	
	  	  	bipedRightArm.rotateAngleX = -0.7F - MathHelper.sin(tick  / 10F) * 0.1F;
	  	  	bipedRightArm.rotateAngleY = 0.0F;
		  	bipedRightArm.rotateAngleZ = -0.6457718F;
	  	  	bipedLeftArm.rotateAngleX = bipedRightArm.rotateAngleX;
	  	  	bipedLeftArm.rotateAngleY = 0.0F;
		  	bipedLeftArm.rotateAngleZ = 0.6457718F;
	  	}
    }
  	
  	
  	
    if(thFairy.getHealth() > 0F)
    {
    	this.bipedBody.rotateAngleX = 0F;
    	if(thFairy.getFlyingHeight() > 0)
    	{
	        this.rightWing.rotateAngleY = MathHelper.cos(tick * 1.3F) * (float)Math.PI * 0.25F - (float)Math.PI;
	        this.leftWing.rotateAngleY = -MathHelper.cos(tick * 1.3F) * (float)Math.PI * 0.25F; 
    	}
    	else
    	{
	        this.rightWing.rotateAngleY = MathHelper.cos(tick * 0.5F) * (float)Math.PI * 0.1F - (float)Math.PI;
	        this.leftWing.rotateAngleY = -MathHelper.cos(tick * 0.5F) * (float)Math.PI * 0.1F;
    	}
    }
    else
    {
    	setRotation(bipedHead, 70F, 0F, 0F);
    	this.rightWing.rotateAngleY = -25F;
        this.leftWing.rotateAngleY = -this.rightWing.rotateAngleY;
    	//this.bipedHead.rotateAngleX = MathHelper.cos(tick * 1.3F) * (float)Math.PI * 0.25F;
    }
  }

}