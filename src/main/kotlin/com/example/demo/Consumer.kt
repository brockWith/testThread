package com.example.demo

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class Consumer {
    @EventListener(classes = [AnyEvent::class])
    fun handleEvent(event: AnyEvent) {
        println("CONSUMER THREAD: ${Thread.currentThread().name}")
        print(event.name)
    }
}
