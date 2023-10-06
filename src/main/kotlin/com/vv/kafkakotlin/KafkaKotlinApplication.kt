package com.vv.kafkakotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaKotlinApplication

fun main(args: Array<String>) {
	runApplication<KafkaKotlinApplication>(*args)
}
