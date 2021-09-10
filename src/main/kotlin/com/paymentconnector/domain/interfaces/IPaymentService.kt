package com.paymentconnector.domain.interfaces

import com.paymentconnector.domain.dtos.PaymentRequest
import com.paymentconnector.domain.dtos.PaymentResponse

interface IPaymentService {
    fun createPayment(payment: PaymentRequest): PaymentResponse
}