package me.checked.it.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerMoveEvent

class BasicCommand: CommandExecutor {

    @EventHandler
    fun handler(event: PlayerMoveEvent){
        val player = event.player
        player.sendMessage(player.location.toString())
    }

    override fun onCommand(sender: CommandSender, cmd: Command, label: String, args: Array<String>): Boolean {
        if (cmd.name.equals("basic", ignoreCase = true)) {
            sender.sendMessage(args)
            return true
        }
        return false
    }

}