package org.json;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements("JSONException")
public class JSONException extends Exception {

	Throwable cause;

	public JSONException(Throwable var1) {
		super(var1.getMessage());
		this.cause = var1;
	}

	public JSONException(String var1) {
		super(var1);
	}

	public Throwable getCause() {
		return this.cause;
	}
}
