package com.runtrack.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RunTrackApplication

fun main(args: Array<String>) {
	runApplication<RunTrackApplication>(*args)
}
