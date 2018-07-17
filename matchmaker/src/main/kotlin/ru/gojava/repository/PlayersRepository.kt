package ru.gojava.repository

import java.util.concurrent.ConcurrentLinkedQueue

data class Player(val name: String)

/**
 * Created by Sergey Rybalkin on 17/07/2018.
 */
interface PlayersRepository {

    /**
     * Inserts the specified element in repository.
     */
    fun put(player: Player)

    /**
     * @return Approximate repository size
     */
    fun size(): Int
}

class PlayersRepositoryImpl : PlayersRepository {
    private val queue = ConcurrentLinkedQueue<Player>()

    override fun put(player: Player) { queue.add(player) }

    override fun size(): Int = queue.size
}



