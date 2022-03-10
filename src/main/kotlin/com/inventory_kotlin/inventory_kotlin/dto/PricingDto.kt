package com.inventory_kotlin.inventory_kotlin.dto

import java.time.LocalDate

class PricingDto(
    val pricingId : Long,
    val pricingName : String,
    val createdDate : LocalDate,
    val modifiedDate : LocalDate,
    val isActive : Boolean

)