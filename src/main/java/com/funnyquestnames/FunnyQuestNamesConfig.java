package com.funnyquestnames;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

import java.util.Map;

@ConfigGroup("FunnyQuestNames")
public interface FunnyQuestNamesConfig extends Config
{
	@ConfigSection(
			name = "Hover For Settings",
			description = "If a name doesn't fit on one line please add line breaks <br>\n" +
					      "24 Characters can fit on one line without needed a break.",
			position = 0
	)
	String testSettings = "generalSettings";

	@ConfigSection(
			name = "Free-To-Play Quests",
			description = "Free To Play Quest Names",
			position = 1
	)
	String f2pSettings = "f2pSettings";


	// f2p Settings
	@ConfigItem(
			keyName = "Cooks Assistant",
			name = "Cooks Assistant",
			description = "Cooks Assistant toggle",
			section = f2pSettings,
			position = 2
	)
	default boolean cooksAssistantToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Cooks Assistant Text",
			name = "Cooks Assistant Text",
			description = "Cooks Assistant Nickname",
			section = f2pSettings,
			position = 3
	)
	default String cooksAssistantNickname() {
		return "Gordon Ramsay's Nightmare";
	}

	@ConfigItem(
			keyName = "Demon Slayer",
			name = "Demon Slayer",
			description = "Demon Slayer toggle",
			section = f2pSettings,
			position = 4
	)
	default boolean demonSlayerToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Demon Slayer Text",
			name = "Demon Slayer Text",
			description = "Demon Slayer Nickname",
			section = f2pSettings,
			position = 5
	)
	default String demonSlayerNickname() {
		return "Anger Management for Red<br>Man";
	}

	@ConfigItem(
			keyName = "The Restless Ghost",
			name = "The Restless Ghost",
			description = "The Restless Ghost toggle",
			section = f2pSettings,
			position = 6
	)
	default boolean theRestlessGhostToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "The Restless Ghost Text",
			name = "The Restless Ghost Text",
			description = "The Restless Ghost Nickname",
			section = f2pSettings,
			position = 7
	)
	default String theRestlessGhostNickname() {
		return "The Mildly Inconvenienced<br>Vapour";
	}

	@ConfigItem(
			keyName = "Romeo & Juliet",
			name = "Romeo & Juliet",
			description = "Romeo & Juliet toggle",
			section = f2pSettings,
			position = 8
	)
	default boolean romeoJulietToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Romeo & Juliet Text",
			name = "Romeo & Juliet Text",
			description = "Romeo & Juliet Nickname",
			section = f2pSettings,
			position = 9
	)
	default String romeoJulietNickname() {
		return "Varrock’s Worst Relationship";
	}

	@ConfigItem(
			keyName = "Sheep Shearer",
			name = "Sheep Shearer",
			description = "Sheep Shearer toggle",
			section = f2pSettings,
			position = 10
	)
	default boolean sheepShearerToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Sheep Shearer Text",
			name = "Sheep Shearer Text",
			description = "Sheep Shearer Nickname",
			section = f2pSettings,
			position = 11
	)
	default String sheepShearerNickname() {
		return "Free Haircuts for Nervous<br>Clouds";
	}

	@ConfigItem(
			keyName = "Shield of Arrav",
			name = "Shield of Arrav",
			description = "Shield of Arrav toggle",
			section = f2pSettings,
			position = 12
	)
	default boolean shieldofArravToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Shield of Arrav Text",
			name = "Shield of Arrav Text",
			description = "Shield of Arrav Nickname",
			section = f2pSettings,
			position = 13
	)
	default String shieldofArravNickname() {
		return "\"Do You Have Friends?\"";
	}

	@ConfigItem(
			keyName = "Ernest the Chicken",
			name = "Ernest the Chicken",
			description = "Ernest the Chicken toggle",
			section = f2pSettings,
			position = 14
	)
	default boolean ernesttheChickenToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Ernest the Chicken Text",
			name = "Ernest the Chicken Text",
			description = "Ernest the Chicken Nickname",
			section = f2pSettings,
			position = 15
	)
	default String ernesttheChickenNickname() {
		return "Man Becomes KFC";
	}

	@ConfigItem(
			keyName = "Vampyre Slayer",
			name = "Vampyre Slayer",
			description = "Vampyre Slayer toggle",
			section = f2pSettings,
			position = 16
	)
	default boolean vampyreSlayerToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Vampyre Slayer Text",
			name = "Vampyre Slayer Text",
			description = "Vampyre Slayer Nickname",
			section = f2pSettings,
			position = 17
	)
	default String vampyreSlayerNickname() {
		return "DIY Vampire Removal";
	}

	@ConfigItem(
			keyName = "Imp Catcher",
			name = "Imp Catcher",
			description = "Imp Catcher toggle",
			section = f2pSettings,
			position = 18
	)
	default boolean impCatcherToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Imp Catcher Text",
			name = "Imp Catcher Text",
			description = "Imp Catcher Nickname",
			section = f2pSettings,
			position = 19
	)
	default String impCatcherNickname() {
		return "BEADS!";
	}

	@ConfigItem(
			keyName = "Prince Ali Rescue",
			name = "Prince Ali Rescue",
			description = "Prince Ali Rescue toggle",
			section = f2pSettings,
			position = 20
	)
	default boolean princeAliRescueToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Prince Ali Rescue Text",
			name = "Prince Ali Rescue Text",
			description = "Prince Ali Rescue Nickname",
			section = f2pSettings,
			position = 21
	)
	default String princeAliRescueNickname() {
		return "Identity Theft Speedrun";
	}

	@ConfigItem(
			keyName = "Doric's Quest",
			name = "Doric's Quest",
			description = "Doric's Quest toggle",
			section = f2pSettings,
			position = 22
	)
	default boolean doricsQuestToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Doric's Quest Text",
			name = "Doric's Quest Text",
			description = "Doric's Quest Nickname",
			section = f2pSettings,
			position = 23
	)
	default String doricsQuestNickname() {
		return "Doric The Explorer";
	}

	@ConfigItem(
			keyName = "Black Knights' Fortress",
			name = "Black Knights' Fortress",
			description = "Black Knights' Fortress toggle",
			section = f2pSettings,
			position = 24
	)
	default boolean blackKnightsFortressToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Black Knights' Fortress Text",
			name = "Black Knights' Fortress Text",
			description = "Black Knights' Fortress Nickname",
			section = f2pSettings,
			position = 25
	)
	default String blackKnightsFortressNickname() {
		return "Soup Sabotage";
	}


	@ConfigItem(
			keyName = "Witch's Potion",
			name = "Witch's Potion",
			description = "Witch's Potion toggle",
			section = f2pSettings,
			position = 26
	)
	default boolean witchsPotionToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Witch's Potion Text",
			name = "Witch's Potion Text",
			description = "Witch's Potion Nickname",
			section = f2pSettings,
			position = 27
	)
	default String witchsPotionNickname() {
		return "Hardcore's beware";
	}

	@ConfigItem(
			keyName = "The Knight's Sword",
			name = "The Knight's Sword",
			description = "The Knight's Sword toggle",
			section = f2pSettings,
			position = 28
	)
	default boolean theKnightsSwordToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "The Knight's Sword Text",
			name = "The Knight's Sword Text",
			description = "The Knight's Sword Nickname",
			section = f2pSettings,
			position = 29
	)
	default String theKnightsSwordNickname() {
		return "Dwarf Does All the Work";
	}

	@ConfigItem(
			keyName = "Goblin Diplomacy",
			name = "Goblin Diplomacy",
			description = "Goblin Diplomacy toggle",
			section = f2pSettings,
			position = 30
	)
	default boolean goblinDiplomacyToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Goblin Diplomacy Text",
			name = "Goblin Diplomacy Text",
			description = "Goblin Diplomacy Nickname",
			section = f2pSettings,
			position = 31
	)
	default String goblinDiplomacyNickname() {
		return "Fashion Advice for Angry<br>Toddlers";
	}

	@ConfigItem(
			keyName = "Pirate's Treasure",
			name = "Pirate's Treasure",
			description = "Pirate's Treasure toggle",
			section = f2pSettings,
			position = 32
	)
	default boolean piratesTreasureToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Pirate's Treasure Text",
			name = "Pirate's Treasure Text",
			description = "Pirate's Treasure Nickname",
			section = f2pSettings,
			position = 33
	)
	default String piratesTreasureNickname() {
		return "Metal Detecting";
	}

	@ConfigItem(
			keyName = "Dragon Slayer I",
			name = "Dragon Slayer I",
			description = "Dragon Slayer I toggle",
			section = f2pSettings,
			position = 34
	)
	default boolean dragonSlayerIToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Dragon Slayer I Text",
			name = "Dragon Slayer I Text",
			description = "Dragon Slayer I Nickname",
			section = f2pSettings,
			position = 35
	)
	default String dragonSlayerINickname() {
		return "Bullying a Very Large Lizard";
	}

	@ConfigItem(
			keyName = "Rune Mysteries",
			name = "Rune Mysteries",
			description = "Rune Mysteries toggle",
			section = f2pSettings,
			position = 36
	)
	default boolean runeMysteriesToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Rune Mysteries Text",
			name = "Rune Mysteries Text",
			description = "Rune Mysteries Nickname",
			section = f2pSettings,
			position = 37
	)
	default String runeMysteriesNickname() {
		return "Wizard Homework";
	}

	@ConfigItem(
			keyName = "Misthalin Mystery",
			name = "Misthalin Mystery",
			description = "Misthalin Mystery toggle",
			section = f2pSettings,
			position = 38
	)
	default boolean misthalinMysteryToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Misthalin Mystery Text",
			name = "Misthalin Mystery Text",
			description = "Misthalin Mystery Nickname",
			section = f2pSettings,
			position = 39
	)
	default String misthalinMysteryNickname() {
		return "CSI: Lumbridge";
	}

	@ConfigItem(
			keyName = "The Corsair Curse",
			name = "The Corsair Curse",
			description = "The Corsair Curse toggle",
			section = f2pSettings,
			position = 40
	)
	default boolean theCorsairCurseToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "The Corsair Curse Text",
			name = "The Corsair Curse Text",
			description = "The Corsair Curse Nickname",
			section = f2pSettings,
			position = 41
	)
	default String theCorsairCurseNickname() {
		return "Boat Problems but Spooky";
	}

	@ConfigItem(
			keyName = "X Marks the Spot",
			name = "X Marks the Spot",
			description = "X Marks the Spot toggle",
			section = f2pSettings,
			position = 42
	)
	default boolean xMarksTheSpotToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "X Marks the Spot Text",
			name = "X Marks the Spot Text",
			description = "X Marks the Spot Nickname",
			section = f2pSettings,
			position = 43
	)
	default String xMarksTheSpotNickname() {
		return "X Marks the G-Spot";
	}

	@ConfigItem(
			keyName = "Below Ice Mountain",
			name = "Below Ice Mountain",
			description = "Below Ice Mountain toggle",
			section = f2pSettings,
			position = 44
	)
	default boolean belowIceMountainToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "Below Ice Mountain Text",
			name = "Below Ice Mountain Text",
			description = "Below Ice Mountain Nickname",
			section = f2pSettings,
			position = 45
	)
	default String belowIceMountainNickname() {
		return "Above Fire Plains";
	}

	@ConfigItem(
			keyName = "The Ides of Milk",
			name = "The Ides of Milk",
			description = "The Ides of Milk toggle",
			section = f2pSettings,
			position = 46
	)
	default boolean theIdesOfMilkToggle() {
		return true;
	}

	@ConfigItem(
			keyName = "The Ides of Milk Text",
			name = "The Ides of Milk Text",
			description = "The Ides of Milk Nickname",
			section = f2pSettings,
			position = 47
	)
	default String theIdesOfMilkNickname() {
		return "Milking the Boss";
	}

}
