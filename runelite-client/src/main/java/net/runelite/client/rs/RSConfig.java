/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.rs;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@Getter
class RSConfig
{
	private String codeBase = "http://oldschool14.runescape.com/";

	private final Map<String, String> appletProperties = new HashMap<>();

	RSConfig()
	{
		appletProperties.put("28", "https://account.jagex.com/");
		appletProperties.put("8", "true");
		appletProperties.put("16", "false");
		appletProperties.put("7", "0");
		appletProperties.put("25", "220");
		appletProperties.put("18", "");
		appletProperties.put("20", "https://social.auth.jagex.com/");
		appletProperties.put("4", "1");
		appletProperties.put("21", "0");
		appletProperties.put("13", ".runescape.com");
		appletProperties.put("19", "196515767263-1oo20deqm6edn7ujlihl6rpadk9drhva.apps.googleusercontent.com");
		appletProperties.put("5", "1");
		appletProperties.put("22", "https://auth.runescape.com/");
		appletProperties.put("3", "true");
		appletProperties.put("6", "0");
		appletProperties.put("9", "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw");
		appletProperties.put("2", "https://payments.jagex.com/");
		appletProperties.put("11", "https://auth.jagex.com/");
		appletProperties.put("10", "5");
		appletProperties.put("12", "314");
		appletProperties.put("14", "0");
		appletProperties.put("15", "0");
		appletProperties.put("17", "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM");
	}
}
