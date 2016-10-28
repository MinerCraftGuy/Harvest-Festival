package joshie.harvest.quests.meetings;

import joshie.harvest.api.core.ITiered.ToolTier;
import joshie.harvest.api.quests.HFQuest;
import joshie.harvest.buildings.HFBuildings;
import joshie.harvest.fishing.HFFishing;
import joshie.harvest.npc.HFNPCs;
import net.minecraft.entity.player.EntityPlayer;

@HFQuest("meeting.jacob")
public class QuestMeetJacob extends QuestMeeting {
    public QuestMeetJacob() {
        super(HFBuildings.FISHING_HUT, HFNPCs.FISHERMAN);
    }

    @Override
    public void onQuestCompleted(EntityPlayer player) {
        rewardItem(player, HFFishing.FISHING_ROD.getStack(ToolTier.BASIC));
    }
}
