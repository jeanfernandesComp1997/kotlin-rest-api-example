package com.paymentconnector.controllers

import com.paymentconnector.domain.dtos.PaymentRequest
import com.paymentconnector.domain.dtos.PaymentResponse
import com.paymentconnector.domain.interfaces.IPaymentService
import com.paymentconnector.domain.services.PaymentService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject

@Controller("/payments")
class PaymentController(private val paymentService: IPaymentService) {
    @Post
    fun payments(paymentRequest: PaymentRequest): HttpResponse<PaymentResponse> {
        try {
            val result = paymentService.createPayment(paymentRequest)

            return HttpResponse.ok(result)
        } catch (ex: Exception) {
            throw ex
        }
    }
}