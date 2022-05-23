package com.jacksonlindsay.cookiemod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.model.IModel;

public class EntityCookieModster extends EntityOcelot {
    public EntityCookieModster(World worldIn) {
        super(worldIn);
//        this.setSize(width, height);
    }

    //Sets task priority for mob AI
    @Override
    protected void initEntityAI(){
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(2, new EntityAIAvoidEntity<>(this, EntitySheep.class, 10.0F, 0.7D, 0.5D));
        tasks.addTask(3, new EntityAIWander(this, 0.5D));
        tasks.addTask(4, new EntityAIPanic(this, 0.7F));
        tasks.addTask(5, new EntityAILookIdle(this));
        tasks.addTask(5, new EntityAITempt(this, 0.7F, Items.COOKIE, false));

    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.9D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(10.0D);
    }

    private EntityAITempt aiTempt;

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (this.isTamed())
        {
            if (this.isOwner(player) && !this.world.isRemote && !this.isBreedingItem(itemstack))
            {
                this.aiSit.setSitting(!this.isSitting());
            }
        }
        else if ((this.aiTempt == null || this.aiTempt.isRunning()) && itemstack.getItem() == Items.COOKIE && player.getDistanceSq(this) < 9.0D)
        {
            if (!player.capabilities.isCreativeMode)
            {
                itemstack.shrink(1);
            }

            if (!this.world.isRemote)
            {
                if (this.rand.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, player))
                {
                    this.setTamedBy(player);
                    this.setTameSkin(1 + this.world.rand.nextInt(3));
                    this.playTameEffect(true);
                    this.aiSit.setSitting(true);
                    this.world.setEntityState(this, (byte)7);
                }
                else
                {
                    this.playTameEffect(false);
                    this.world.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.processInteract(player, hand);
    }

    //Breeding protocol
    @Override
    public EntityOcelot createChild(EntityAgeable ageable){
        this.setSize(0.5F, 0.5F);
        return new EntityCookieModster(world);
    }

//    @Override
//    protected void entityInit() {
//
//    }


    //SOUNDS WILL COME LATER AS AN EXTRA
//    @Override
//    protected SoundEvent getHurtSound(DamageSource source){
//        return SoundsHandler.COOKIE_MODSTER-HURT;
//    }
//
//    @Override
//    protected SoundEvent getDeathSound(){
//        return SoundsHandler.COOKIE_MODSTER-DEATH;
//    }
//
//    @Nullable
//    @Override
//    protected SoundEvent getAmbientSound() {
//        return SoundsHandler.COOKIE_MODSTER-AMBIENT;
//    }
//
//    @Nullable
//    @Override
//    protected ResourceLocation getLootTable() {
//        return super.getLootTable();
//    }
}
