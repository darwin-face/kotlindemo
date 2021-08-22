package com.example.kotlindemo.message.api

import com.example.kotlindemo.message.domain.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource{
    @GetMapping
    fun index(): List<Message> = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!"),
    )

    @GetMapping("/butt/{name}", "/butt")
    fun butt(@PathVariable name: String?): String {
        val retName: String = name ?: "You"
        return "$retName is a butt"
    }
}