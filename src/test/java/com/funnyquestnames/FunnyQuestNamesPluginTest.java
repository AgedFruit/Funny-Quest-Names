package com.funnyquestnames;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FunnyQuestNamesPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FunnyQuestNamesPlugin.class);
		RuneLite.main(args);
	}
}