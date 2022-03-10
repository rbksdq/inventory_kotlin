package com.inventory_kotlin.inventory_kotlin.entity

import java.time.LocalDate
import javax.persistence.*


@Entity
@Table(name = "Pricing")
data class Pricing(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val pricingId : Long,
    val pricingName : String,
    val createdDate : LocalDate,
    val modifiedDate : LocalDate,
    val isActive : Boolean

)
