package com.runtrack.demo

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<RunTrackApplication>().with(TestcontainersConfiguration::class).run(*args)
}
