package com.sjkz1.cml_particles;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CMLParticles implements ModInitializer {
	public static final String MOD_ID = "cml-particles";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static List<String> NAME_LIST = new ArrayList<>();

	@Override
	public void onInitialize() {
		ModParticles.registerParticles();
		try
		{
			InputStream input = (new URL("https://raw.githubusercontent.com/SJKZ1-2565/Tracker/refs/heads/master/LipSync.txt")).openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
			NAME_LIST.addAll(reader.lines().toList());
		} catch (Exception ignored)
		{
		}
	}
	public static Identifier location(String path)
	{
		return new Identifier(MOD_ID, path);
	}

}