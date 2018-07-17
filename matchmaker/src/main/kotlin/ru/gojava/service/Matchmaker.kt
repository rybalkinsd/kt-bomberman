package ru.gojava.service

import ru.gojava.repository.Player

/**
 * Created by Sergey Rybalkin on 17/07/2018.
 */
interface Matchmaker {
    fun join(player: Player)

    fun queueSize(): Int
}

