package com.paymentconnector.domain.valueObjects

import kotlinx.serialization.Serializable

@Serializable
class Customer {
    var ownId: String
        private set

    var fullname: String
        private set

    var email: String
        private set

    constructor(
        ownId: String,
        fullname: String,
        email: String,
    ) {
        this.ownId = ownId
        this.fullname = fullname
        this.email = email
    }
}

/*class Customer(
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
}*/