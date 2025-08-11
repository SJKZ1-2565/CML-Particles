package com.sjkz1.cml_particles;

import com.sjkz1.cml_particles.particles.RotateParticleEffect;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.ParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles
{
    public static final ParticleType<RotateParticleEffect> LASER_1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> LASER_2 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> LASER_3 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_DISTORTION = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_MODEL_UV = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_RIBBON_PARENT = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_RIBBON_SWORD = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_RING_SHAPE1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_RING_SHAPE2 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_SPAWNMETHOD1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_SPRITE_BILLBOARD = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_SPRITE_FIXED = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_SPRITE_FIXEDYAXIS = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_TRACK1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_TURBULENCE_FIREWORKS = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SIMPLE_TURBULENCE_PARTICLES = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);

    public static final ParticleType<RotateParticleEffect> AURA_1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> BARRIOR_1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> BARRIOR_2 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> BARRIOR_3 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> FORCE_FIELD_TORNADO = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);

    public static final ParticleType<RotateParticleEffect> BLUE_LASER = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> BOSS_DEATH = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> DRILL = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> ELECTRIC_DUST = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> FIRE = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> HALO = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> HALO_2 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> HIT_EFF = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGICAL_CIRCLE = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> RADIAL = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> RADIAL_2 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SHOCKWAVE = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SMALL_TEXTURES_RIBBON = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SMALL_TEXTURES_SQURE_WAVE_ORBITAL = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> STRIP = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);


    public static final ParticleType<RotateParticleEffect> HEAL_POTION_1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> HEAL_POTION_2 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_COLD = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_DARK = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_FIRE_1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_FIRE_2 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_HEAL_1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_HEAL_2 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_LIGHT = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_METEO = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_SHIELD = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_SWORD = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_THUNDER = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_TORNADE = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MAGIC_WATER = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> POWER_UP = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SPEAR_1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SPEAR_2 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SWORD_1 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SWORD_2 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);


    public static final ParticleType<RotateParticleEffect> ATMOSPHERE = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> BACKGROUND = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> FLAME = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> HERALD = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> HOLY_SANDSTORM = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> MISSILE_BOOST = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> PHANTASM_METEOR = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> PHANTASM_METEOR_SINGLE = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SONIC_BOOM = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);


    public static final ParticleType<RotateParticleEffect> BENEDICTION = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> BLOOD_LANCE = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> COSMIC_MIST = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> FEATHER_BOMB = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> FIRE_BALL = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> GATE_OF_CALVE = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> LOSS_OF_BLOOD = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SWORD_EMBER = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SWORD_LIGHTNING = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SWORD_MOONLIGHT = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SWORD_SACREDLIGHT = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SWORD_STORM = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);

    public static final ParticleType<RotateParticleEffect> AURA_MAGMGA = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SWORD_MAGMGA = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> SNOW_STORM = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);

    public static final ParticleType<RotateParticleEffect> LIGHT = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> TOON_HIT = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> TOON_WATER = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);
    public static final ParticleType<RotateParticleEffect> ESCHATON_01 = FabricParticleTypes.complex(true, RotateParticleEffect.PARAMETERS_FACTORY);

    public static void registerParticles()
    {
        //Basic
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "laser_1"),
                LASER_1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "laser_2"),
                LASER_2);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "laser_3"),
                LASER_3);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_distortion"),
                SIMPLE_DISTORTION);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_model_uv"),
                SIMPLE_MODEL_UV);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_ribbon_parent"),
                SIMPLE_RIBBON_PARENT);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_ribbon_sword"),
                SIMPLE_RIBBON_SWORD);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_ring_shape1"),
                SIMPLE_RING_SHAPE1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_ring_shape2"),
                SIMPLE_RING_SHAPE2);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_spawnmethod1"),
                SIMPLE_SPAWNMETHOD1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_sprite_billboard"),
                SIMPLE_SPRITE_BILLBOARD);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_sprite_fixed"),
                SIMPLE_SPRITE_FIXED);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_sprite_fixedyaxis"),
                SIMPLE_SPRITE_FIXEDYAXIS);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_track1"),
                SIMPLE_TRACK1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_turbulence_fireworks"),
                SIMPLE_TURBULENCE_FIREWORKS);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "simple_turbulence_particles"),
                SIMPLE_TURBULENCE_PARTICLES);


        //Version 16
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "aura_1"),
                AURA_1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "barrior_1"),
                BARRIOR_1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "barrior_2"),
                BARRIOR_2);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "barrior_3"),
                BARRIOR_3);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "force_field_tornado"),
                FORCE_FIELD_TORNADO);


        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "blue_laser"),
                BLUE_LASER);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "boss_death"),
                BOSS_DEATH);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "drill"),
                DRILL);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "electric_dust"),
                ELECTRIC_DUST);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "fire"),
                FIRE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "halo"),
                HALO);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "halo_2"),
                HALO_2);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "hit_eff"),
                HIT_EFF);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magical_circle"),
                MAGICAL_CIRCLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "radial"),
                RADIAL);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "radial_2"),
                RADIAL_2);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "shockwave"),
                SHOCKWAVE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "small_textures_ribbon"),
                SMALL_TEXTURES_RIBBON);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "small_textures_square_wave_orbital"),
                SMALL_TEXTURES_SQURE_WAVE_ORBITAL);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "strip"),
                STRIP);


        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "heal_potion_1"),
                HEAL_POTION_1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "heal_potion_2"),
                HEAL_POTION_2);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_cold"),
                MAGIC_COLD);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_dark"),
                MAGIC_DARK);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_fire_1"),
                MAGIC_FIRE_1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_fire_2"),
                MAGIC_FIRE_2);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_heal_1"),
                MAGIC_HEAL_1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_heal_2"),
                MAGIC_HEAL_2);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_light"),
                MAGIC_LIGHT);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_meteo"),
                MAGIC_METEO);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_shield"),
                MAGIC_SHIELD);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_sword"),
                MAGIC_SWORD);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_thunder"),
                MAGIC_THUNDER);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_tornade"),
                MAGIC_TORNADE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "magic_water"),
                MAGIC_WATER);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "power_up"),
                POWER_UP);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "spear_1"),
                SPEAR_1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "spear_2"),
                SPEAR_2);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "sword_1"),
                SWORD_1);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "sword_2"),
                SWORD_2);


        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "atmosphere"),
                ATMOSPHERE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "background"),
                BACKGROUND);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "flame"),
                FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "herald"),
                HERALD);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "holy_sandstorm"),
                HOLY_SANDSTORM);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "missile_boost"),
                MISSILE_BOOST);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "phantasm_meteor"),
                PHANTASM_METEOR);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "phantasm_meteor_single"),
                PHANTASM_METEOR_SINGLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "sonic_boom"),
                SONIC_BOOM);

        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "benediction"),
                BENEDICTION);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "blood_lance"),
                BLOOD_LANCE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "cosmic_mist"),
                COSMIC_MIST);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "feather_bomb"),
                FEATHER_BOMB);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "fire_ball"),
                FIRE_BALL);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "gate_of_calve"),
                GATE_OF_CALVE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "loss_of_blood"),
                LOSS_OF_BLOOD);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "sword_ember"),
                SWORD_EMBER);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "sword_lightning"),
                SWORD_LIGHTNING);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "sword_moonlight"),
                SWORD_MOONLIGHT);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "sword_sacredlight"),
                SWORD_SACREDLIGHT);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "sword_storm"),
                SWORD_STORM);

        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "aura_magma"),
                AURA_MAGMGA);

        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "sword_magma"),
                SWORD_MAGMGA);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "snow_storm"),
                SNOW_STORM);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "light"),
                LIGHT);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "toon_hit"),
                TOON_HIT);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "toon_water"),
                TOON_WATER);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CMLParticles.MOD_ID, "eschaton_01"),
                ESCHATON_01);
    }
}
