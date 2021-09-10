package com.paymentconnector.domain.entities

import com.paymentconnector.domain.dtos.PaymentRequest
import kotlinx.serialization.Serializable

class Payment(paymentRequest: PaymentRequest) {
    var ownId: String
        private set

    var items: MutableList<Items>
        private set

    var customer: Customer
        private set

    init {
        ownId = paymentRequest.ownId
        items = ArrayList()
        paymentRequest.items.forEach {
            items.add(Items(it.product, it.quantity, it.detail, it.price))
        }
        customer = Customer(
            paymentRequest.customer.ownId,
            paymentRequest.customer.fullname,
            paymentRequest.customer.email
        )
    }
}