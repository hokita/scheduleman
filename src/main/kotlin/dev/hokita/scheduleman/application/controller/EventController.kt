package dev.hokita.scheduleman.application.controller

import dev.hokita.scheduleman.application.view.EventView
import dev.hokita.scheduleman.domain.repository.EventRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EventController(
    val eventRepository: EventRepository
) {
    @GetMapping("/event")
    suspend fun GetEvent(): EventView {
        val event = eventRepository.get()
        return EventView(
            title = event.title
        )
    }
}
