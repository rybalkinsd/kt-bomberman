package ru.gojava.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import ru.gojava.repository.Player
import ru.gojava.service.Matchmaker

/**
 * Created by Sergey Rybalkin on 26/11/17.
 */
@RestController
class JoinController(val matchmaker: Matchmaker) {

    @PostMapping(value = ["matchmaker/join"], consumes = [MediaType.APPLICATION_FORM_URLENCODED_VALUE])
    fun join(name: String) = matchmaker.join(Player(name))

    @GetMapping(value = ["matchmaker/queue"])
    fun queue(): Int = matchmaker.queueSize()
}