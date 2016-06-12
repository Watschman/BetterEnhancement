package com.watschman.betterenhancement.server;

import com.watschman.betterenhancement.reference.Reference;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class BetterEnhancementCommand implements ICommand{
    private List aliases;
    private List tabs;
    private List gods;
    public BetterEnhancementCommand(){
        this.aliases = new ArrayList();
        this.aliases.add("betterenhancement");
        this.aliases.add("Betterenhancement");
        this.aliases.add("BetterEnhancement");
        this.aliases.add("be");
        this.tabs = new ArrayList();
        this.tabs.add("god");
    }
    @Override
    public String getCommandName() {
        return "betterenhancement";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "Usage: /be god";
    }

    @Override
    public List<String> getCommandAliases() {
        return this.aliases;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (args.length == 0)
            sender.addChatMessage(new TextComponentString(getCommandUsage(sender)));
        else {
            if (args[0].equals("god")){
                if (gods.contains(sender))
                    gods.remove(sender);
                else
                    gods.add(sender);
            }
            else
                sender.addChatMessage(new TextComponentString(getCommandUsage(sender)));
        }
        loadgods(sender);
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        if (Reference.isSinglePlayer)
            return true;
        else
            return sender.canCommandSenderUseCommand(2, "betterenhancement");
    }

    @Override
    public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos pos) {
        return this.tabs;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
    public void loadgods(ICommandSender sender){
        for (Object god : this.gods) {
            EntityPlayerMP entityplayermp = (EntityPlayerMP) god;
            entityplayermp.capabilities.allowFlying = true;
            entityplayermp.capabilities.disableDamage = true;
        }
    }
}
