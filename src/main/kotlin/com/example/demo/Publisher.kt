package com.example.demo

import org.springframework.context.ApplicationEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class Publisher(
    private val applicationEventPublisher: ApplicationEventPublisher,
) {
    fun a(){
        val aa=AnyEvent(name="Brock")
        println("PUBLISH THREAD: ${Thread.currentThread().name}")
        applicationEventPublisher.publishEvent(aa)
        Thread.sleep(5000L)
    }
}

data class AnyEvent(val name:String)
