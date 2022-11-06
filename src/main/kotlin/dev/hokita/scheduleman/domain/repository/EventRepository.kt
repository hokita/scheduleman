package dev.hokita.scheduleman.domain.repository

import dev.hokita.scheduleman.domain.entity.Event

interface EventRepository {
    fun get(): Event
}
