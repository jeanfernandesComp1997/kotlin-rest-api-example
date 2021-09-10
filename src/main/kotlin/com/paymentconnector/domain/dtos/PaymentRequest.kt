package com.paymentconnector.domain.dtos

import kotlinx.serialization.Serializable

@Serializable
data class PaymentRequest(
    val ownId: String,
    val items: List<Items>,
    val customer: Customer,
)

@Serializable
data class Items(
    val product: String,
    val quantity: Int,
    val detail: String,
    val price: Float,
)

@Serializable
data class Customer(
    val ownId: String,
    val fullname: String,
    val email: String,
)