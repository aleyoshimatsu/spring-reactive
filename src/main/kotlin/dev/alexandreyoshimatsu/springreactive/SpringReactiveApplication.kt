package dev.alexandreyoshimatsu.springreactive

import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringReactiveApplication

fun main(args: Array<String>) {
//	runApplication<SpringReactiveApplication>(*args)
	val app = SpringApplication(SpringReactiveApplication::class.java)
	app.webApplicationType = WebApplicationType.REACTIVE
	app.run(*args)
}
