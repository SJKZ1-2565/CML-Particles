package com.sjkz1.cml_particles.particles;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.Vec2f;

import java.util.Locale;

public class RotateParticleEffect implements ParticleEffect
{
    public static final Factory<RotateParticleEffect> PARAMETERS_FACTORY = new Factory<>()
    {
        public RotateParticleEffect read(ParticleType<RotateParticleEffect> particleType, StringReader stringReader) throws CommandSyntaxException
        {
            stringReader.expect(' ');
            float pitch = (float) stringReader.readDouble();
            stringReader.expect(' ');
            float yaw = (float) stringReader.readDouble();

            Vec2f rotate = new Vec2f(pitch, yaw);
            return new RotateParticleEffect(pitch, yaw, particleType);
        }

        public RotateParticleEffect read(ParticleType<RotateParticleEffect> particleType, PacketByteBuf packetByteBuf)
        {

            float pitch = packetByteBuf.readFloat();
            float yaw = packetByteBuf.readFloat();
            return new RotateParticleEffect(pitch, yaw, particleType);
        }
    };
    private final float pitch;
    private final float yaw;
    private final ParticleType<?> type;

    public RotateParticleEffect(float pitch, float yaw, ParticleType<?> type)
    {
        this.pitch = pitch;
        this.yaw = yaw;
        this.type = type;
    }

    public static Codec<RotateParticleEffect> createCodec(ParticleType<RotateParticleEffect> type)
    {
        return type.getCodec()
                .xmap((state) -> new RotateParticleEffect(state.pitch, state.yaw, type), (effect) -> effect);
    }

    public void write(PacketByteBuf buf)
    {
        buf.writeFloat(this.pitch);
        buf.writeFloat(this.yaw);
    }

    public String asString()
    {
        return String.format(Locale.ROOT, "%s %.2f %.2f", Registries.PARTICLE_TYPE.getId(this.getType()), this.pitch, this.yaw);
    }

    @Override
    public ParticleType<?> getType()
    {
        return this.type;
    }

    public float getPitch()
    {
        return this.pitch;
    }

    public float getYaw()
    {
        return this.yaw;
    }
}

