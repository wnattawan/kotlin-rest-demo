package com.nwa.rest.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

data class Argument(val x:Int, val y:Int)

@RestController
class CalcController {
    @GetMapping("/calc")
    fun add(@RequestBody argument: Argument) = argument.x + argument.y
}