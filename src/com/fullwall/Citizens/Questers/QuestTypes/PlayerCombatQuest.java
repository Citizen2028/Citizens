package com.fullwall.Citizens.Questers.QuestTypes;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.fullwall.Citizens.Questers.Quest;
import com.fullwall.Citizens.Questers.QuestTypes.QuestManager.QuestType;
import com.fullwall.resources.redecouverte.NPClib.HumanNPC;

public class PlayerCombatQuest implements Quest {
	private HumanNPC questGiver;
	private Player killer;
	private Player victim;
	private ItemStack weapon;

	public PlayerCombatQuest(HumanNPC questGiver, Player killer, Player victim,
			ItemStack weapon) {
		this.questGiver = questGiver;
		this.killer = killer;
		this.victim = victim;
		this.weapon = weapon;
	}

	@Override
	public Player getPlayer() {
		return killer;
	}

	public Player getVictim() {
		return victim;
	}

	@Override
	public QuestType getType() {
		return QuestType.PLAYER_COMBAT;
	}

	@Override
	public String getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCompleted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HumanNPC getQuestGiver() {
		return questGiver;
	}

	@Override
	public void setQuestGiver(HumanNPC questGiver) {
		this.questGiver = questGiver;
	}

	public ItemStack getWeapon() {
		return weapon;
	}

	public void setWeapon(ItemStack weapon) {
		this.weapon = weapon;
	}
}