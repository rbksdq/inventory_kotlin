package com.inventory_kotlin.inventory_kotlin.exception

import com.inventory_kotlin.inventory_kotlin.dto.ResponseDTO
import org.springframework.context.MessageSource
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class RestResponseEntityExceptionHandler(private val messageSource: MessageSource):
ResponseEntityExceptionHandler(){

    fun handleControllerException(
        ex: ProductNotFoundException,
        request: WebRequest
    ) : ResponseEntity<Any>{
        val responseDto=
            ResponseDTO(status = HttpStatus.NOT_FOUND.value(), data = "Product not found")
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseDto)
    }

    @ExceptionHandler(RuntimeException::class)
    fun handleInternal(ex: RuntimeException, request: WebRequest): ResponseEntity<Any> {
         val responseDTO = ResponseDTO(status = 500, data = "Server Error")
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseDTO)
    }
}