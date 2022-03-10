package com.inventory_kotlin.inventory_kotlin.dto

import java.util.*

class ProductDto (

    val productId : Long,
    val productName : String,
    val createdDate: Date,
    val modifiedDate: Date,
    val isActive : Boolean
)
