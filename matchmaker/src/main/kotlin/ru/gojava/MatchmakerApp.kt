package ru.gojava

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans
import ru.gojava.repository.PlayersRepositoryImpl
import ru.gojava.service.MatchmakerImpl

/**
 * Created by Sergey Rybalkin on 26/11/17.
 */
@SpringBootApplication
class MatchmakerApp

fun main(args: Array<String>) {
    runApplication<MatchmakerApp>(*args) {
        addInitializers(
            beans {
                bean<MatchmakerImpl>()
                bean<PlayersRepositoryImpl>()
            }
        )
    }
}