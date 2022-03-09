package com.inventory_kotlin.inventory_kotlin.service

import com.inventory_kotlin.inventory_kotlin.dto.ProductDto
import com.inventory_kotlin.inventory_kotlin.entity.Product

interface ProductService {
    fun findAll(): List<ProductDto>
    fun addUser(pro: ProductDto): Product
}