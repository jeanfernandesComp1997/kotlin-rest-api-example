package com.paymentconnector.controllers

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/healthcheck")
class DefaultController {
    @Get
    fun healhCheck(): HttpResponse<HealthStatus> {
        return HttpResponse.ok(HealthStatus("Ok", "Running"))
    }
}

data class HealthStatus(
    val status: String,
    val message: String,
)