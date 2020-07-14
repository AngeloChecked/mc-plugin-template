package me.checked.it

import me.checked.it.command.BasicCommand
import me.checked.it.listener.RandomListener
import org.bukkit.plugin.java.JavaPlugin

class Plugin : JavaPlugin() {

    override fun onEnable() {
        logger.info("onEnable has been invoked!")
        server.pluginManager.registerEvents(RandomListener(), this)
        getCommand("basic").executor = BasicCommand()
    }

    override fun onDisable() {
        logger.info("onDisable has been invoked!")
    }
}