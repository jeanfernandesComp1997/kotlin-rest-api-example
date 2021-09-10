package com.paymentconnector.controllers

import com.paymentconnector.domain.dtos.PaymentRequest
import com.paymentconnector.domain.dtos.PaymentResponse
import com.paymentconnector.domain.entities.Payment
import com.paymentconnector.domain.interfaces.IPaymentService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/payments")
class PaymentController(private val paymentService: IPaymentService) {
    @Post
    fun payments(paymentRequest: PaymentRequest): HttpResponse<PaymentResponse> {
        try {
            val payment = Payment(paymentRequest)

            val result = paymentService.createPayment(payment)

            return HttpResponse.ok(result)
        } catch (ex: Exception) {
            throw ex
        }
    }
}