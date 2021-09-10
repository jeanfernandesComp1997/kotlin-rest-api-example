package com.paymentconnector.domain.interfaces

import com.paymentconnector.domain.dtos.PaymentRequest
import com.paymentconnector.domain.dtos.PaymentResponse
import com.paymentconnector.domain.entities.Payment

interface IPaymentService {
    fun createPayment(payment: Payment): PaymentResponse
}