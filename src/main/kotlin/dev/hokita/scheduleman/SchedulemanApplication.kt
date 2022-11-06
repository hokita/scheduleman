package dev.hokita.scheduleman

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SchedulemanApplication

fun main(args: Array<String>) {
	runApplication<SchedulemanApplication>(*args)
}
