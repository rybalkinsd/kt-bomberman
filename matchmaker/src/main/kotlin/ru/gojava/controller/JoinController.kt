package ru.gojava.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Sergey Rybalkin on 26/11/17.
 */
@RestController
class JoinController {

    @PostMapping(value = ["matchmaker/join"], consumes = [MediaType.APPLICATION_FORM_URLENCODED_VALUE])
    fun join(name: String) = print(name)

}