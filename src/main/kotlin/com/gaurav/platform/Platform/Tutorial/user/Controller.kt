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

}