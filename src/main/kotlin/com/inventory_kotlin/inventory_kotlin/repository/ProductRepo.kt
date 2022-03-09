package com.inventory_kotlin.inventory_kotlin.repository

import com.inventory_kotlin.inventory_kotlin.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepo : JpaRepository<Product, Long>   {
}