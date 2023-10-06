package com.vv.kafkakotlin.service

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import java.util.concurrent.CountDownLatch

@Component
class KafkaConsumer {

    private val logger = KotlinLogging.logger {}



    @KafkaListener(topics = ["vvtopic"], groupId = "vv1234")
    fun listenGroupFoo(message: String) {
        logger.error("Received Message in group vv1234: $message")
    }
}
