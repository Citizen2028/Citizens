package net.citizensnpcs.questers.quests;

import java.util.List;

import net.citizensnpcs.questers.quests.progress.QuestProgress;
import net.citizensnpcs.questers.rewards.Reward;

import org.bukkit.entity.Player;

public class RewardGranter {
	// TODO: think of a better name for this.
	private final String completionMessage;
	private final List<Reward> rewards;

	public RewardGranter(String message, List<Reward> rewards) {
		this.completionMessage = message;
		this.rewards = rewards;
	}

	public void onCompletion(Player player, QuestProgress progress) {
		if (!this.completionMessage.isEmpty()) {
			player.sendMessage(completionMessage);
		}
		for (Reward reward : this.getRewards()) {
			reward.grant(player, progress.getQuesterUID());
		}
	}

	public String getCompletionMessage() {
		return this.completionMessage;
	}

	public List<Reward> getRewards() {
		return rewards;
	}
}