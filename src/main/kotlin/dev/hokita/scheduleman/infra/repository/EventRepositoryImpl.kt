package dev.hokita.scheduleman.infra.repository

import dev.hokita.scheduleman.domain.entity.Event
import dev.hokita.scheduleman.domain.repository.EventRepository
import org.springframework.stereotype.Repository

@Repository
class EventRepositoryImpl : EventRepository {
    override fun get(): Event {
        return Event("Play Game!!")
    }
}
