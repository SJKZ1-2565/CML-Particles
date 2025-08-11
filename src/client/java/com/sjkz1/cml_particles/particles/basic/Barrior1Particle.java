package com.sjkz1.cml_particles.particles.basic;

import com.sjkz1.cml_particles.particles.BaseCustomParticle;
import com.sjkz1.cml_particles.particles.RotateParticleEffect;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;

public class Barrior1Particle extends BaseCustomParticle
{
    protected Barrior1Particle(ClientWorld level, double xCoord, double yCoord, double zCoord, SpriteProvider spriteSet, double xd, double yd, double zd, float pitch, float yaw)
    {
        super(level, xCoord, yCoord, zCoord, spriteSet, xd, yd, zd, pitch, yaw);
    }

    @Override
    protected String getParticleName()
    {
        return "Barrior01";
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
            return new Barrior1Particle(level, x, y, z, this.sprites, dx, dy, dz, pitch, yaw);
        }
    }
}
