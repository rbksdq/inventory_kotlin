package com.inventory_kotlin.inventory_kotlin.entity

import org.springframework.data.annotation.CreatedDate
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table( name = "Product")
data class Product (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val productId : Long,
    val productName : String,
    val createdDate : LocalDate,
    val modifiedDate : LocalDate,
    val isActive : Boolean

)
/*companion object {
    fun createFromUserModel(pro: com.inventory_kotlin.inventory_kotlin.service.ProductService) = Product(
        productId = pro.pr,
        productName = pro.productName,
        createdDate = LocalDate(),

    )
}*/
