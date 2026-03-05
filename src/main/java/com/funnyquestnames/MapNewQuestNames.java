package com.funnyquestnames;

import net.runelite.client.plugins.Plugin;

import javax.inject.Inject;

public class MapNewQuestNames extends Plugin {

    @Inject
    private FunnyQuestNamesPlugin plugin;

    @Inject
    private FunnyQuestNamesConfig config;

    public void MapQuestNames(){
        // f2p Quests
        plugin.QuestNameReplacements.put(QuestNames.COOKS_ASSISTANT, config.cooksAssistantToggle() ? config.cooksAssistantNickname() : QuestNames.COOKS_ASSISTANT);
        plugin.QuestNameReplacements.put(QuestNames.DEMON_SLAYER, config.demonSlayerToggle() ? config.demonSlayerNickname() : QuestNames.DEMON_SLAYER);
        plugin.QuestNameReplacements.put(QuestNames.THE_RESTLESS_GHOST, config.theRestlessGhostToggle() ? config.theRestlessGhostNickname() : QuestNames.THE_RESTLESS_GHOST);
        plugin.QuestNameReplacements.put(QuestNames.ROMEO_JULIET, config.romeoJulietToggle() ? config.romeoJulietNickname() : QuestNames.ROMEO_JULIET);
        plugin.QuestNameReplacements.put(QuestNames.SHEEP_SHEARER, config.sheepShearerToggle() ? config.sheepShearerNickname() : QuestNames.SHEEP_SHEARER);
        plugin.QuestNameReplacements.put(QuestNames.SHIELD_OF_ARRAV, config.shieldofArravToggle() ? config.shieldofArravNickname() : QuestNames.SHIELD_OF_ARRAV);
        plugin.QuestNameReplacements.put(QuestNames.ERNEST_THE_CHICKEN, config.ernesttheChickenToggle() ? config.ernesttheChickenNickname() : QuestNames.ERNEST_THE_CHICKEN);
        plugin.QuestNameReplacements.put(QuestNames.VAMPYRE_SLAYER, config.vampyreSlayerToggle() ? config.vampyreSlayerNickname() : QuestNames.VAMPYRE_SLAYER);
        plugin.QuestNameReplacements.put(QuestNames.IMP_CATCHER, config.impCatcherToggle() ? config.impCatcherNickname() : QuestNames.IMP_CATCHER);
        plugin.QuestNameReplacements.put(QuestNames.PRINCE_ALI_RESCUE, config.princeAliRescueToggle() ? config.princeAliRescueNickname() : QuestNames.PRINCE_ALI_RESCUE);
        plugin.QuestNameReplacements.put(QuestNames.DORICS_QUEST, config.doricsQuestToggle() ? config.doricsQuestNickname() : QuestNames.DORICS_QUEST);
        plugin.QuestNameReplacements.put(QuestNames.BLACK_KNIGHTS_FORTRESS, config.blackKnightsFortressToggle() ? config.blackKnightsFortressNickname() : QuestNames.BLACK_KNIGHTS_FORTRESS);
        plugin.QuestNameReplacements.put(QuestNames.WITCHS_POTION, config.witchsPotionToggle() ? config.witchsPotionNickname() : QuestNames.WITCHS_POTION);
        plugin.QuestNameReplacements.put(QuestNames.THE_KNIGHTS_SWORD, config.theKnightsSwordToggle() ? config.theKnightsSwordNickname() : QuestNames.THE_KNIGHTS_SWORD);
        plugin.QuestNameReplacements.put(QuestNames.GOBLIN_DIPLOMACY, config.goblinDiplomacyToggle() ? config.goblinDiplomacyNickname() : QuestNames.GOBLIN_DIPLOMACY);
        plugin.QuestNameReplacements.put(QuestNames.PIRATES_TREASURE, config.piratesTreasureToggle() ? config.piratesTreasureNickname() : QuestNames.PIRATES_TREASURE);
        plugin.QuestNameReplacements.put(QuestNames.DRAGON_SLAYER_I, config.dragonSlayerIToggle() ? config.dragonSlayerINickname() : QuestNames.DRAGON_SLAYER_I);
        plugin.QuestNameReplacements.put(QuestNames.RUNE_MYSTERIES, config.runeMysteriesToggle() ? config.runeMysteriesNickname() : QuestNames.RUNE_MYSTERIES);
        plugin.QuestNameReplacements.put(QuestNames.MISTHALIN_MYSTERY, config.misthalinMysteryToggle() ? config.misthalinMysteryNickname() : QuestNames.MISTHALIN_MYSTERY);
        plugin.QuestNameReplacements.put(QuestNames.THE_CORSAIR_CURSE, config.theCorsairCurseToggle() ? config.theCorsairCurseNickname() : QuestNames.THE_CORSAIR_CURSE);
        plugin.QuestNameReplacements.put(QuestNames.X_MARKS_THE_SPOT, config.xMarksTheSpotToggle() ? config.xMarksTheSpotNickname() : QuestNames.X_MARKS_THE_SPOT);
        plugin.QuestNameReplacements.put(QuestNames.BELOW_ICE_MOUNTAIN, config.belowIceMountainToggle() ? config.belowIceMountainNickname() : QuestNames.BELOW_ICE_MOUNTAIN);
        plugin.QuestNameReplacements.put(QuestNames.THE_IDES_OF_MILK, config.theIdesOfMilkToggle() ? config.theIdesOfMilkNickname() : QuestNames.THE_IDES_OF_MILK);


        // p2p Quests
    }

}
