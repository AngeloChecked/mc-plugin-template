package me.checked.it.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent

class RandomListener: Listener {

    @EventHandler
    fun handler(event: PlayerMoveEvent){
        val player = event.player
        player.sendMessage(player.location.toString())
    }
}