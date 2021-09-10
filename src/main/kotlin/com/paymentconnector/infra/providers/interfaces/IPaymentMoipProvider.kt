package com.paymentconnector.infra.providers.interfaces

import com.paymentconnector.domain.dtos.PaymentRequest
import com.paymentconnector.infra.providers.dtos.CreatePaymentMoipResponse

interface IPaymentMoipProvider {
    fun createPayment(payment: PaymentRequest): CreatePaymentMoipResponse
}