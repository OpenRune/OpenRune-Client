package com.jagex.oldscape.pub;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements("OtlTokenResponse")
public interface OtlTokenResponse {
	boolean isSuccess();

	String getToken();
}
