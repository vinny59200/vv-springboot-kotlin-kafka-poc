package com.vv.kafkakotlin.service

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import io.github.oshai.kotlinlogging.KotlinLogging

@Service
class KafkaProducer {
    private val logger = KotlinLogging.logger {}
    @Autowired
    private lateinit var kafkaTemplate: KafkaTemplate<String, String>

    @Value("\${test.topic}")
    private lateinit var topicName: String

    fun sendMessage(msg: String) {
        logger.error("sending message='{}' to topic='{}'", msg, topicName);
        kafkaTemplate.send(topicName, msg)
    }



}