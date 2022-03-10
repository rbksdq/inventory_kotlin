package com.inventory_kotlin.inventory_kotlin.dto

data class ResponseDTO(val status: Int, val data: Any)

class ResponseErrprDTO(
    val message: String,
    val code: String
)

data class Error(val errorCode: String, val errorDescription: String)