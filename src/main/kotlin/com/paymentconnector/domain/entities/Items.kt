package com.paymentconnector.domain.entities

class Items(
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
}