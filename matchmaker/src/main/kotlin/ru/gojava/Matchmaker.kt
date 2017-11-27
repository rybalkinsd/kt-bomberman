package ru.gojava

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by Sergey Rybalkin on 26/11/17.
 */
@SpringBootApplication
class Matchmaker

fun main(args: Array<String>) {
    SpringApplication.run(Matchmaker::class.java, *args)
}