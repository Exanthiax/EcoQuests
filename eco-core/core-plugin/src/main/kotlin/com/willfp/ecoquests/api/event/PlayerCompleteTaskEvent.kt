package com.willfp.ecoquests.api.event

import com.willfp.ecoquests.tasks.Task
import org.bukkit.entity.Player
import org.bukkit.event.HandlerList
import org.bukkit.event.player.PlayerEvent

class PlayerCompleteTaskEvent(
    who: Player,
    val task: Task
): PlayerEvent(who) {
    override fun getHandlers(): HandlerList {
        return HANDLERS
    }

    companion object {
        private val HANDLERS = HandlerList()

        @JvmStatic
        fun getHandlerList(): HandlerList {
            return HANDLERS
        }
    }
}
