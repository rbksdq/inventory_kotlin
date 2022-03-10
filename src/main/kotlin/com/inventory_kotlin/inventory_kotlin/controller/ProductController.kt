package com.inventory_kotlin.inventory_kotlin.controller

import com.inventory_kotlin.inventory_kotlin.dto.ProductDto
import com.inventory_kotlin.inventory_kotlin.entity.Product
import com.inventory_kotlin.inventory_kotlin.repository.ProductRepo
import com.inventory_kotlin.inventory_kotlin.service.ProductService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/products"], method = [RequestMethod.GET])
class ProductController(val productRepo: ProductRepo) {

    @GetMapping()
    fun findAll() = productRepo.findAll()

    /*@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addUser(@RequestBody pro: Product) =
        Product.createFromUserModel(productRepo.addUser(pro.toUserModel()))*/

    @GetMapping("/products/{id}")
    fun fetchProductsById(@PathVariable("id") productId: Long): ResponseEntity<Product> {
        val product = productRepo.findById(productId)
        if (product.isPresent) {
            return ResponseEntity<Product>(product.get(), HttpStatus.OK)
        }
        return ResponseEntity<Product>(HttpStatus.NOT_FOUND)
    }

}