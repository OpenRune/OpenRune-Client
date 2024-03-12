package com.jagex.oldscape.pub;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements("RefreshAccessTokenResponse")
public interface RefreshAccessTokenResponse {
	boolean isSuccess();

	String getAccessToken();

	String getRefreshToken();
}
