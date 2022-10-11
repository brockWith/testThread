package com.example.demo

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@Component
class A(private val publisher: Publisher) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        print("!!!!!!!!!!!!!!!!")
        repeat(10) {
            println("START THREAD : ${Thread.currentThread().name}")
            publisher.a()
        }

    }
}
