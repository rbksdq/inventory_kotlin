package com.inventory_kotlin.inventory_kotlin.entity

import java.util.*
import javax.persistence.*

@Entity
@Table( name = "Product")
data class Product (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val productId : Long,
    val productName : String,
    val createdDate : Date,
    val modifiedDate : Date,
    val isActive : Boolean

)