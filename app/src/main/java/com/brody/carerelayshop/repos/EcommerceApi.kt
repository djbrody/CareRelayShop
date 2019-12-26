package com.brody.carerelayshop.repos

import com.brody.carerelayshop.model.Product
import retrofit2.http.GET

interface EcommerceApi {

    @GET("api/ecommerce/v1/allProducts")
    suspend fun fetchAllProducts(): List<Product>
}
