package com.inventory_kotlin.inventory_kotlin.controller

import com.inventory_kotlin.inventory_kotlin.dto.ProductDto
import com.inventory_kotlin.inventory_kotlin.entity.Product
import com.inventory_kotlin.inventory_kotlin.repository.ProductRepo
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
//@RequestMapping(value = "/products")
class ProductController(val productRepo: ProductRepo) {

    @GetMapping("/products")
    fun getAllProducts():
            ResponseEntity<List<ProductDto>>{
        val products= productRepo.findAll()
        if (products.isEmpty()){
            return ResponseEntity<List<ProductDto>>(HttpStatus.NO_CONTENT)
        }
        return ResponseEntity<List<ProductDto>>(products, HttpStatus.OK)
    }


}