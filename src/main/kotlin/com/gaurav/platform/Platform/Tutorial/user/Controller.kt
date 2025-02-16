package com.gaurav.platform.Platform.Tutorial.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
class Controller {

    @GetMapping
    fun getUser(): String {
        return "Hello"
    }

    //  create a new endpoint that returns a list of users
    @GetMapping("/all")
    fun getUsers(): List<String> {
        return listOf("Gaurav", "Rahul", "Rohit")
    }

}