package joshie.harvest.quests.packet;

import io.netty.buffer.ByteBuf;
import joshie.harvest.api.quests.Quest;
import joshie.harvest.core.network.Packet;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.network.ByteBufUtils;

import static joshie.harvest.core.network.PacketHandler.sendToClient;
import static joshie.harvest.core.network.PacketHandler.sendToDimension;

@Packet
public class PacketQuestIncrease extends PacketQuest {
    private Quest quest;
    private NBTTagCompound tag;

    public PacketQuestIncrease() {}
    public PacketQuestIncrease(Quest quest, NBTTagCompound tag) {
        this.quest = quest;
        this.tag = tag;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        super.toBytes(buf);
        ByteBufUtils.writeUTF8String(buf, quest.getRegistryName().toString());
        buf.writeBoolean(tag != null);
        if (tag != null) ByteBufUtils.writeTag(buf, tag);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        super.fromBytes(buf);
        quest = Quest.REGISTRY.getValue(new ResourceLocation(ByteBufUtils.readUTF8String(buf)));
        if (buf.readBoolean()) tag = ByteBufUtils.readTag(buf);
    }

    @Override
    public void handlePacket(EntityPlayer player) {
        Quest real = getQuestDataFromPlayer(player).getAQuest(quest);
        if (real != null) {
            if (!player.worldObj.isRemote) {
                real.quest_stage++;
                if (uuid == null) sendToClient(new PacketQuestIncrease(real, real.writeToNBT(new NBTTagCompound())), player);
                else sendToDimension(player.worldObj.provider.getDimension(), new PacketQuestIncrease(real, real.writeToNBT(new NBTTagCompound())).setUUID(uuid));
            } else real.readFromNBT(tag);
        }
    }
}