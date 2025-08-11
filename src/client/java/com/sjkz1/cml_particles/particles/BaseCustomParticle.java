package com.sjkz1.cml_particles.particles;

import com.sjkz1.cml_particles.CMLParticles;
import mod.chloeprime.aaaparticles.api.client.effekseer.ParticleEmitter;
import mod.chloeprime.aaaparticles.api.common.AAALevel;
import mod.chloeprime.aaaparticles.api.common.ParticleEmitterInfo;
import mod.chloeprime.aaaparticles.client.registry.EffectRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.Vec2f;

import java.util.Objects;

public class BaseCustomParticle extends SpriteBillboardParticle
{

    private final float pitch;
    private final float yaw;
    private final ParticleEmitterInfo EMITTER_INFO = new ParticleEmitterInfo(CMLParticles.location(getParticleName()));
    private int timer;

    protected BaseCustomParticle(ClientWorld level, double xCoord, double yCoord, double zCoord,
                                 SpriteProvider spriteSet, double xd, double yd, double zd, float pitch, float yaw)
    {
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);

        this.x = xd;
        this.y = yd;
        this.z = zd;
        this.maxAge = 200;
        this.setSpriteForAge(spriteSet);
        this.red = 1f;
        this.green = 1f;
        this.blue = 1f;
        this.timer = 0;
        this.pitch = pitch;
        this.yaw = yaw;
    }


    @Override
    public void tick()
    {
        super.tick();
        if (this.timer == 0)
        {
            this.timer++;
            if (MinecraftClient.getInstance().player != null)
            {
                AAALevel.addParticle(world, false, EMITTER_INFO.clone()
                        .position(this.x, this.y, this.z).useEntityHeadSpace(true)
                        .rotation(new Vec2f(this.pitch, this.yaw)));
            }
        }
        if (this.age >= this.maxAge)
        {
            var emitter = Objects.requireNonNull(EffectRegistry.get(CMLParticles.location(getParticleName()))).emitters();
            emitter.forEach(ParticleEmitter::stop);
        }
    }

    @Override
    public ParticleTextureSheet getType()
    {
        return ParticleTextureSheet.NO_RENDER;
    }

    protected String getParticleName()
    {
        return "";
    }

    public ParticleEmitterInfo getEmitter()
    {
        return EMITTER_INFO;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<RotateParticleEffect>
    {
        private final SpriteProvider sprites;

        public Factory(SpriteProvider spriteSet)
        {
            this.sprites = spriteSet;
        }

        public Particle createParticle(RotateParticleEffect particleType, ClientWorld level, double x, double y, double z,
                                       double dx, double dy, double dz)
        {
            float pitch = particleType.getPitch();
            float yaw = particleType.getYaw();
            return new BaseCustomParticle(level, x, y, z, this.sprites, dx, dy, dz, pitch, yaw);
        }
    }
}
