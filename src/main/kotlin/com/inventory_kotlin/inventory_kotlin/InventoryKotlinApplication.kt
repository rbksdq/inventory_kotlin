package com.inventory_kotlin.inventory_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class InventoryKotlinApplication

fun main(args: Array<String>) {
	runApplication<InventoryKotlinApplication>(*args)
//
//	@GetMapping("/rbk")
//	fun get() = "Hello"
//	println(get());

}
