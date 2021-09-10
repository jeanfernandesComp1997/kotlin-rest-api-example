package com.paymentconnector.domain.entities

class Customer(
    ownId: String,
    fullName: String,
    email: String,
) {
    var ownId: String
        private set

    var fullName: String
        private set

    var email: String
        private set

    init {
        this.ownId = ownId
        this.fullName = fullName
        this.email = email
    }
}