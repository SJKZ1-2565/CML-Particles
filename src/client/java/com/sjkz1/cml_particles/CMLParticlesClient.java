package com.sjkz1.cml_particles;

import com.sjkz1.cml_particles.particles.basic.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CMLParticlesClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        FabricLoader.getInstance().getModContainer(CMLParticles.MOD_ID).ifPresent(container ->
        {
            ResourceManagerHelper.registerBuiltinResourcePack(
                    Identifier.of(CMLParticles.MOD_ID, "chameleon_house"),
                    container, Text.of("Chameleon House")
                    , ResourcePackActivationType.DEFAULT_ENABLED
            );
        });
        ParticleFactoryRegistry.getInstance().register(ModParticles.LASER_1, Laser1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.LASER_2, Laser2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.LASER_3, Laser3Particle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_DISTORTION, SimpleDistortionParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_MODEL_UV, SimpleModelUvParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_RIBBON_PARENT, SimpleRibbonParentParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_RIBBON_SWORD, SimpleRibbonSwordParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_SPAWNMETHOD1, SimpleSpawnMethod1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_RING_SHAPE1, SimpleRingShape1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_RING_SHAPE2, SimpleRingShape2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_SPRITE_BILLBOARD, SimpleSpriteBillBoardParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_SPRITE_FIXED, SimpleSpriteFixedParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_SPRITE_FIXEDYAXIS, SimpleSpriteFixedYAxisParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SIMPLE_TRACK1, SimpleTrack1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_TURBULENCE_FIREWORKS, SimpleTurbulenceFireWorksParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SIMPLE_TURBULENCE_PARTICLES, SimpleTurbulenceParticlesParticle.Factory::new);


        ParticleFactoryRegistry.getInstance().register(ModParticles.AURA_1, Aura1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BARRIOR_1, Barrior1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BARRIOR_2, Barrior2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BARRIOR_3, Barrior3Particle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.FORCE_FIELD_TORNADO, ForceFieldTornadoParticle.Factory::new);


        ParticleFactoryRegistry.getInstance().register(ModParticles.BLUE_LASER, BlueLaserParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BOSS_DEATH, BossDeathParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.DRILL, DrillParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.ELECTRIC_DUST, ElectricDustParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.FIRE, FireParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.HALO, HaloParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.HALO_2, Halo2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.HIT_EFF, HitEffParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGICAL_CIRCLE, MagicCircleParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.RADIAL, RadialParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.RADIAL_2, Radial2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SHOCKWAVE, ShockwaveParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SMALL_TEXTURES_RIBBON, SmallTexturesRibbonParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SMALL_TEXTURES_SQURE_WAVE_ORBITAL, SmallTexturesSqureParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.STRIP, StripParticle.Factory::new);


        ParticleFactoryRegistry.getInstance().register(ModParticles.HEAL_POTION_1, HealPotion1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.HEAL_POTION_2, HealPotion2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_COLD, MagicColdParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_DARK, MagicDarkParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_FIRE_1, MagicFire1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_FIRE_2, MagicFire2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_HEAL_1, MagicHeal1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_HEAL_2, MagicHeal2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_LIGHT, MagicLightParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_METEO, MagicMeteoParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_SHIELD, MagicShieldParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_SWORD, MagicSwordParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_THUNDER, MagicThunderParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_TORNADE, MagicTornadeParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MAGIC_WATER, MagicWaterParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.POWER_UP, PowerUpParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SPEAR_1, Spear1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SPEAR_2, Spear2Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SWORD_1, Sword1Particle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SWORD_2, Sword2Particle.Factory::new);

        ParticleFactoryRegistry.getInstance().register(ModParticles.ATMOSPHERE, AtmosphereParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BACKGROUND, BackgroundParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.FLAME, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.HERALD, HeraldParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.HOLY_SANDSTORM, HolySandstormParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.MISSILE_BOOST, MissileBoostParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.PHANTASM_METEOR, PhantasmMeteorParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.PHANTASM_METEOR_SINGLE, PhantasmMeteorSingleParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SONIC_BOOM, SonicBoomParticle.Factory::new);


        ParticleFactoryRegistry.getInstance().register(ModParticles.BENEDICTION, BenedictionParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BLOOD_LANCE, BloodLanceParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.COSMIC_MIST, CosmicMistParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.FEATHER_BOMB, FeatherbombParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.FIRE_BALL, FireballParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GATE_OF_CALVE, GateOfCalveParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.LOSS_OF_BLOOD, LossOfBloodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SWORD_EMBER, SwordEmberParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SWORD_LIGHTNING, SwordLightningParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SWORD_MOONLIGHT, SwordMoonlightParticle.Factory::new);
        ParticleFactoryRegistry.getInstance()
                .register(ModParticles.SWORD_SACREDLIGHT, SwordSacredlightParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SWORD_STORM, SwordStormParticle.Factory::new);

        ParticleFactoryRegistry.getInstance().register(ModParticles.AURA_MAGMGA, AuraMagmaParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SWORD_MAGMGA, SwordMagmaParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.SNOW_STORM, SnowStormParticle.Factory::new);

        ParticleFactoryRegistry.getInstance().register(ModParticles.LIGHT, LightParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.TOON_HIT, ToonHitParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.TOON_WATER, ToonWaterParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.ESCHATON_01, Eschaton_01Particle.Factory::new);
    }
}