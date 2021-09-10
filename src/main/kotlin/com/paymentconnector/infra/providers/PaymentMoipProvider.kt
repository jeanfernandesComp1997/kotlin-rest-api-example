package com.paymentconnector.infra.providers

import com.paymentconnector.domain.dtos.PaymentRequest
import com.paymentconnector.domain.entities.Payment
import com.paymentconnector.infra.providers.dtos.CreatePaymentMoipResponse
import com.paymentconnector.infra.providers.interfaces.IPaymentMoipProvider
import jakarta.inject.Singleton
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

@Singleton
class PaymentMoipProvider : IPaymentMoipProvider {
    override fun createPayment(payment: PaymentRequest): CreatePaymentMoipResponse {
        try {
            val client = HttpClient.newBuilder().build()

            val request = HttpRequest.newBuilder()
                .uri(URI.create("https://sandbox.moip.com.br/v2/orders"))
                .setHeader(
                    "Authorization",
                    "Basic MU9WWkdMRFdJS1BaV1FHQ1JJS0ZQQlpGUVI1UlRXQU06RE5PSVdYQlgwSkNLR0lDWVZTSkFPWU9LRVFIUldITzRXM1ZPSDlDQw=="
                )
                .setHeader("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(Json.encodeToString(payment)))
                .build()

            val responseHttp = client.send(request, HttpResponse.BodyHandlers.ofString())

            return Json { ignoreUnknownKeys = true }.decodeFromString<CreatePaymentMoipResponse>(responseHttp.body())
        } catch (ex: Exception) {
            throw ex
        }
    }
}