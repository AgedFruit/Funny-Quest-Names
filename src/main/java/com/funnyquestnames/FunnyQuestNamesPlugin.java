package com.funnyquestnames;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.widgets.Widget;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@PluginDescriptor(
	name = "Funny Quest Names"
)
public class FunnyQuestNamesPlugin extends Plugin
{
	private static final int QUEST_LIST_GROUP_ID = 399;
	private static final int QUEST_LIST_CHILD_ID = 7;
	public Map<String, String> QuestNameReplacements = new HashMap<String, String>();

	@Inject
	private Client client;

	@Inject
	private FunnyQuestNamesConfig config;

	@Inject
	private MapNewQuestNames mapNewNames;

	@Override
	protected void startUp() throws Exception
	{
		log.debug("Funny Quest Names started!");
		mapNewNames.MapQuestNames();
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event) {
		mapNewNames.MapQuestNames();
		renameQuests();
	}

	private void renameQuests(){
		Widget questList = client.getWidget(QUEST_LIST_GROUP_ID, QUEST_LIST_CHILD_ID);

		if (questList == null)
			return;

		for (Widget w : questList.getDynamicChildren())
		{
			String replacement = QuestNameReplacements.get(w.getText());
			if (replacement != null)
			{
				if (replacement.length() >= 24)
				{
					w.setOriginalHeight(27);
					w.setLineHeight(11);
					w.setHeightMode(27);
					w.setText(replacement);
					w.setName("<col=ff9040>" + replacement + "</col>");
					return;
				}

				w.setText(replacement);
				w.setName("<col=ff9040>" + replacement + "</col>");
			}
		}
	}

	@Subscribe
	public void onClientTick(ClientTick event)
	{
		renameQuests();
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.debug("Funny Quest Names stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says test stuff", null);
		}
	}

	@Provides
	FunnyQuestNamesConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(FunnyQuestNamesConfig.class);
	}
}
