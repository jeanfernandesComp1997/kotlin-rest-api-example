package com.paymentconnector.domain.services

import com.paymentconnector.domain.dtos.PaymentResponse
import com.paymentconnector.domain.entities.Payment
import com.paymentconnector.domain.interfaces.IPaymentService
import com.paymentconnector.infra.providers.interfaces.IPaymentMoipProvider
import jakarta.inject.Singleton

@Singleton
class PaymentService(private val paymentMoipProvider: IPaymentMoipProvider) : IPaymentService {
    override fun createPayment(payment: Payment): PaymentResponse {
        val result = paymentMoipProvider.createPayment(payment)

        return PaymentResponse(result.id, convertStatus(result.status).toString())
    }

    private fun convertStatus(status: String): StatusPaymentConnector {
        val status = when (status) {
            "CREATED" -> StatusPaymentConnector.undefined
            else -> StatusPaymentConnector.undefined
        }

        return status
    }
}

enum class StatusPaymentConnector {
    undefined
}