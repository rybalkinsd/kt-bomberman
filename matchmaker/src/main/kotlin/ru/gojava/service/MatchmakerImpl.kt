package ru.gojava.service

import ru.gojava.repository.Player
import ru.gojava.repository.PlayersRepository

class MatchmakerImpl(val playersRepository: PlayersRepository) : Matchmaker {
    override fun join(player: Player) {
        playersRepository.put(player)
    }

    override fun queueSize(): Int = playersRepository.size()

}