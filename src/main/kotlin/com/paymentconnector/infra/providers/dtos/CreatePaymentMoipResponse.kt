package com.paymentconnector.infra.providers.dtos

import kotlinx.serialization.Serializable

@Serializable
data class CreatePaymentMoipResponse(
    val id: String,
    val ownId: String,
    val status: String,
)