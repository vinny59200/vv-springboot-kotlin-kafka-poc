package com.vv.kafkakotlin.controller

import com.vv.kafkakotlin.service.KafkaProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class KafkaController {

    @Autowired
    private lateinit var prod: KafkaProducer;

    @GetMapping("/messages/{msg}")
    fun sendMessage(@PathVariable("msg") msg: String) {
        prod.sendMessage(msg)
    }

}