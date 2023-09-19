package com.mdemel.ksrestapi.manesrestapi_kotlinspringboot.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping(value = arrayOf("/"))
    fun sayHello() = "Hello world!"
}