//package com.inventory_kotlin.inventory_kotlin.service
//
//import com.inventory_kotlin.inventory_kotlin.dto.ProductDto
//import com.inventory_kotlin.inventory_kotlin.entity.Product
//import com.inventory_kotlin.inventory_kotlin.exception.ProductNotFoundException
//import com.inventory_kotlin.inventory_kotlin.repository.ProductRepo
//import org.springframework.stereotype.Service
//import javax.transaction.Transactional
//
//@Service
//class ProductServiceImp(val productRepo: ProductRepo) : ProductService {
//
//    @Transactional
//    override fun findAll(): List<ProductDto> {
//        productRepo.findAll()
//    }
//
//    @Throws(ProductNotFoundException::class)
//    @Transactional
//    override fun addUser(pro: ProductDto): Product {
//        val productDto = productRepo.findByProductName(findByProductName(pro))
//        if (productDto != null) {
//            throw ProductNotFoundException("doesnt exist")
//        }
//        productRepo.save(productDto)
//    }
//
//    override fun findByProductName(pro: ProductDto): Product? {
//        TODO("Not yet implemented")
//    }
//}