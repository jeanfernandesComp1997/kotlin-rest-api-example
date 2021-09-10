package com.paymentconnector.infra.providers.interfaces

import com.paymentconnector.domain.entities.Payment
import com.paymentconnector.infra.providers.dtos.CreatePaymentMoipResponse

interface IPaymentMoipProvider {
    fun createPayment(payment: Payment): CreatePaymentMoipResponse
}