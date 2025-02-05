/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.client.hiscore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.SpriteID;
import static net.runelite.client.hiscore.HiscoreSkillType.SKILL;
import static net.runelite.client.hiscore.HiscoreSkillType.ACTIVITY;
import static net.runelite.client.hiscore.HiscoreSkillType.BOSS;

@AllArgsConstructor
@Getter
public enum HiscoreSkill
{
	OVERALL("Overall", HiscoreSkillType.OVERALL, SpriteID.SKILL_TOTAL),
	ATTACK("Attack", SKILL, SpriteID.SKILL_ATTACK),
	DEFENCE("Defence", SKILL, SpriteID.SKILL_DEFENCE),
	STRENGTH("Strength", SKILL, SpriteID.SKILL_STRENGTH),
	HITPOINTS("Hitpoints", SKILL, SpriteID.SKILL_HITPOINTS),
	RANGED("Ranged", SKILL, SpriteID.SKILL_RANGED),
	PRAYER("Prayer", SKILL, SpriteID.SKILL_PRAYER),
	MAGIC("Magic", SKILL, SpriteID.SKILL_MAGIC),
	COOKING("Cooking", SKILL, SpriteID.SKILL_COOKING),
	WOODCUTTING("Woodcutting", SKILL, SpriteID.SKILL_WOODCUTTING),
	FLETCHING("Fletching", SKILL, SpriteID.SKILL_FLETCHING),
	FISHING("Fishing", SKILL, SpriteID.SKILL_FISHING),
	FIREMAKING("Firemaking", SKILL, SpriteID.SKILL_FIREMAKING),
	CRAFTING("Crafting", SKILL, SpriteID.SKILL_CRAFTING),
	SMITHING("Smithing", SKILL, SpriteID.SKILL_SMITHING),
	MINING("Mining", SKILL, SpriteID.SKILL_MINING),
	HERBLORE("Herblore", SKILL, SpriteID.SKILL_HERBLORE),
	AGILITY("Agility", SKILL, SpriteID.SKILL_AGILITY),
	THIEVING("Thieving", SKILL, SpriteID.SKILL_THIEVING),
	SLAYER("Slayer", SKILL, SpriteID.SKILL_SLAYER),
	FARMING("Farming", SKILL, SpriteID.SKILL_FARMING),
	RUNECRAFT("Runecraft", SKILL, SpriteID.SKILL_RUNECRAFT),
	HUNTER("Hunter", SKILL, SpriteID.SKILL_HUNTER),
	CONSTRUCTION("Construction", SKILL, SpriteID.SKILL_CONSTRUCTION),
	LEAGUE_POINTS("League Points", ACTIVITY, SpriteID.HISCORE_LEAGUE_POINTS),
	BOUNTY_HUNTER_HUNTER("Bounty Hunter - Hunter", ACTIVITY, SpriteID.HISCORE_BOUNTY_HUNTER_HUNTER),
	BOUNTY_HUNTER_ROGUE("Bounty Hunter - Rogue", ACTIVITY, SpriteID.HISCORE_BOUNTY_HUNTER_ROGUE),
	CLUE_SCROLL_ALL("Clue Scrolls (all)", ACTIVITY, SpriteID.HISCORE_CLUE_SCROLL_ALL),
	CLUE_SCROLL_BEGINNER("Clue Scrolls (beginner)", ACTIVITY),
	CLUE_SCROLL_EASY("Clue Scrolls (easy)", ACTIVITY),
	CLUE_SCROLL_MEDIUM("Clue Scrolls (medium)", ACTIVITY),
	CLUE_SCROLL_HARD("Clue Scrolls (hard)", ACTIVITY),
	CLUE_SCROLL_ELITE("Clue Scrolls (elite)", ACTIVITY),
	CLUE_SCROLL_MASTER("Clue Scrolls (master)", ACTIVITY),
	LAST_MAN_STANDING("LMS - Rank", ACTIVITY, SpriteID.HISCORE_LAST_MAN_STANDING),
	PVP_ARENA_RANK("PvP Arena - Rank", ACTIVITY, SpriteID.HISCORE_PVP_ARENA_RANK),
	SOUL_WARS_ZEAL("Soul Wars Zeal", ACTIVITY, SpriteID.HISCORE_SOUL_WARS_ZEAL),
	RIFTS_CLOSED("Rifts closed", ACTIVITY, SpriteID.HISCORE_RIFTS_CLOSED),
	COLOSSEUM_GLORY("Colosseum Glory", ACTIVITY, SpriteID.HISCORE_COLOSSEUM_GLORY),
	ABYSSAL_SIRE("Abyssal Sire", BOSS, SpriteID.HISCORE_ABYSSAL_SIRE),
	ALCHEMICAL_HYDRA("Alchemical Hydra", BOSS, SpriteID.HISCORE_ALCHEMICAL_HYDRA),
	AMOXLIATL("Amoxliatl", BOSS, SpriteID.HISCORE_AMOXLIATL),
	ARAXXOR("Araxxor", BOSS, SpriteID.HISCORE_ARAXXOR),
	ARTIO("Artio", BOSS, SpriteID.HISCORE_ARTIO_CALLISTO),
	BARROWS_CHESTS("Barrows Chests", BOSS, SpriteID.HISCORE_BARROWS_CHESTS),
	BRYOPHYTA("Bryophyta", BOSS, SpriteID.HISCORE_BRYOPHYTA),
	CALLISTO("Callisto", BOSS, SpriteID.HISCORE_ARTIO_CALLISTO),
	CALVARION("Calvar'ion", BOSS, SpriteID.HISCORE_CALVARION_VETION),
	CERBERUS("Cerberus", BOSS, SpriteID.HISCORE_CERBERUS),
	CHAMBERS_OF_XERIC("Chambers of Xeric", BOSS, SpriteID.HISCORE_CHAMBERS_OF_XERIC),
	CHAMBERS_OF_XERIC_CHALLENGE_MODE("Chambers of Xeric: Challenge Mode", BOSS, SpriteID.HISCORE_CHAMBERS_OF_XERIC_CHALLENGE_MODE),
	CHAOS_ELEMENTAL("Chaos Elemental", BOSS, SpriteID.HISCORE_CHAOS_ELEMENTAL),
	CHAOS_FANATIC("Chaos Fanatic", BOSS, SpriteID.HISCORE_CHAOS_FANATIC),
	COMMANDER_ZILYANA("Commander Zilyana", BOSS, SpriteID.HISCORE_COMMANDER_ZILYANA),
	CORPOREAL_BEAST("Corporeal Beast", BOSS, SpriteID.HISCORE_CORPOREAL_BEAST),
	CRAZY_ARCHAEOLOGIST("Crazy Archaeologist", BOSS, SpriteID.HISCORE_CRAZY_ARCHAEOLOGIST),
	DAGANNOTH_PRIME("Dagannoth Prime", BOSS, SpriteID.HISCORE_DAGANNOTH_PRIME),
	DAGANNOTH_REX("Dagannoth Rex", BOSS, SpriteID.HISCORE_DAGANNOTH_REX),
	DAGANNOTH_SUPREME("Dagannoth Supreme", BOSS, SpriteID.HISCORE_DAGANNOTH_SUPREME),
	DERANGED_ARCHAEOLOGIST("Deranged Archaeologist", BOSS, SpriteID.HISCORE_DERANGED_ARCHAEOLOGIST),
	DUKE_SUCELLUS("Duke Sucellus", BOSS, SpriteID.HISCORE_DUKE_SUCELLUS),
	GENERAL_GRAARDOR("General Graardor", BOSS, SpriteID.HISCORE_GENERAL_GRAARDOR),
	GIANT_MOLE("Giant Mole", BOSS, SpriteID.HISCORE_GIANT_MOLE),
	GROTESQUE_GUARDIANS("Grotesque Guardians", BOSS, SpriteID.HISCORE_GROTESQUE_GUARDIANS),
	HESPORI("Hespori", BOSS, SpriteID.HISCORE_HESPORI),
	KALPHITE_QUEEN("Kalphite Queen", BOSS, SpriteID.HISCORE_KALPHITE_QUEEN),
	KING_BLACK_DRAGON("King Black Dragon", BOSS, SpriteID.HISCORE_KING_BLACK_DRAGON),
	KRAKEN("Kraken", BOSS, SpriteID.HISCORE_KRAKEN),
	KREEARRA("Kree'Arra", BOSS, SpriteID.HISCORE_KREEARRA),
	KRIL_TSUTSAROTH("K'ril Tsutsaroth", BOSS, SpriteID.HISCORE_KRIL_TSUTSAROTH),
	LUNAR_CHESTS("Lunar Chests", BOSS, SpriteID.HISCORE_LUNAR_CHESTS),
	MIMIC("Mimic", BOSS, SpriteID.HISCORE_MIMIC),
	NEX("Nex", BOSS, SpriteID.HISCORE_NEX),
	NIGHTMARE("Nightmare", BOSS, SpriteID.HISCORE_NIGHTMARE),
	PHOSANIS_NIGHTMARE("Phosani's Nightmare", BOSS, SpriteID.HISCORE_NIGHTMARE),
	OBOR("Obor", BOSS, SpriteID.HISCORE_OBOR),
	PHANTOM_MUSPAH("Phantom Muspah", BOSS, SpriteID.HISCORE_PHANTOM_MUSPAH),
	SARACHNIS("Sarachnis", BOSS, SpriteID.HISCORE_SARACHNIS),
	SCORPIA("Scorpia", BOSS, SpriteID.HISCORE_SCORPIA),
	SCURRIUS("Scurrius", BOSS, SpriteID.HISCORE_SCURRIUS),
	SKOTIZO("Skotizo", BOSS, SpriteID.HISCORE_SKOTIZO),
	SOL_HEREDIT("Sol Heredit", BOSS, SpriteID.HISCORE_SOL_HEREDIT),
	SPINDEL("Spindel", BOSS, SpriteID.HISCORE_SPINDEL_VENENATIS),
	TEMPOROSS("Tempoross", BOSS, SpriteID.HISCORE_TEMPOROSS),
	THE_GAUNTLET("The Gauntlet", BOSS, SpriteID.HISCORE_THE_GAUNTLET),
	THE_CORRUPTED_GAUNTLET("The Corrupted Gauntlet", BOSS, SpriteID.HISCORE_THE_CORRUPTED_GAUNTLET),
	THE_HUEYCOATL("The Hueycoatl", BOSS, SpriteID.HISCORE_THE_HUEYCOATL),
	THE_LEVIATHAN("The Leviathan", BOSS, SpriteID.HISCORE_THE_LEVIATHAN),
	THE_ROYAL_TITANS("The Royal Titans", BOSS, SpriteID.HISCORE_ROYAL_TITANS),
	THE_WHISPERER("The Whisperer", BOSS, SpriteID.HISCORE_THE_WHISPERER),
	THEATRE_OF_BLOOD("Theatre of Blood", BOSS, SpriteID.HISCORE_THEATRE_OF_BLOOD),
	THEATRE_OF_BLOOD_HARD_MODE("Theatre of Blood: Hard Mode", BOSS, SpriteID.HISCORE_THEATRE_OF_BLOOD),
	THERMONUCLEAR_SMOKE_DEVIL("Thermonuclear Smoke Devil", BOSS, SpriteID.HISCORE_THERMONUCLEAR_SMOKE_DEVIL),
	TOMBS_OF_AMASCUT("Tombs of Amascut", BOSS, SpriteID.HISCORE_TOMBS_OF_AMASCUT),
	TOMBS_OF_AMASCUT_EXPERT("Tombs of Amascut: Expert Mode", BOSS, SpriteID.HISCORE_TOMBS_OF_AMASCUT_EXPERT),
	TZKAL_ZUK("TzKal-Zuk", BOSS, SpriteID.HISCORE_TZKAL_ZUK),
	TZTOK_JAD("TzTok-Jad", BOSS, SpriteID.HISCORE_TZTOK_JAD),
	VARDORVIS("Vardorvis", BOSS, SpriteID.HISCORE_VARDORVIS),
	VENENATIS("Venenatis", BOSS, SpriteID.HISCORE_SPINDEL_VENENATIS),
	VETION("Vet'ion", BOSS, SpriteID.HISCORE_CALVARION_VETION),
	VORKATH("Vorkath", BOSS, SpriteID.HISCORE_VORKATH),
	WINTERTODT("Wintertodt", BOSS, SpriteID.HISCORE_WINTERTODT),
	ZALCANO("Zalcano", BOSS, SpriteID.HISCORE_ZALCANO),
	ZULRAH("Zulrah", BOSS, SpriteID.HISCORE_ZULRAH);

	private final String name;
	private final HiscoreSkillType type;
	private final int spriteId;

	HiscoreSkill(String name, HiscoreSkillType type)
	{
		this.name = name;
		this.type = type;
		this.spriteId = -1;
	}
}
