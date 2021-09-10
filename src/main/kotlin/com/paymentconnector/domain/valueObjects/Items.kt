package com.paymentconnector.domain.valueObjects

import kotlinx.serialization.Serializable

@Serializable
class Items {
    var product: String
        private set

    var quantity: Int
        private set

    var detail: String
        private set

    var price: Int
        private set

    constructor(
        product: String,
        quantity: Int,
        detail: String,
        price: Float,
    ) {
        this.product = product
        this.quantity = quantity
        this.detail = detail
        this.price = (price * 100).toInt()
    }
}

/*class Items(
    product: String,
    quantity: Int,
    detail: String,
    price: Float,
) {
    var product: String
        private set

    var quantity: Int
        private set

    var detail: String
        private set

    var price: Int
        private set

    init {
        this.product = product
        this.quantity = quantity
        this.detail = detail
        this.price = (price * 100).toInt()
    }
}*/