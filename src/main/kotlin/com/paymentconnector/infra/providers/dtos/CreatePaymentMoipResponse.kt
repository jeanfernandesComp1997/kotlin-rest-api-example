package com.paymentconnector.infra.providers.dtos

import kotlinx.serialization.Serializable

@Serializable
data class CreatePaymentMoipResponse(
    val id: String,
    val ownId: String,
    val status: String,
)


/*
{
    "id": "ORD-V2QRVTPTCWBV",
    "ownId": "pedido-teste-6546456",
    "status": "CREATED",
    "platform": "V2",
    "createdAt": "2021-09-10T09:10:50.466-03",
    "updatedAt": "2021-09-10T09:10:50.466-03",
    "amount": {
        "paid": 0,
        "total": 14600,
        "fees": 0,
        "refunds": 0,
        "liquid": 0,
        "otherReceivers": 0,
        "currency": "BRL",
        "subtotals": {
            "shipping": 0,
            "addition": 0,
            "discount": 0,
            "items": 14600
        }
    },
    "items": [
        {
            "product": "Box de Seriado - Exterminate! Cancel",
            "price": 7300,
            "detail": "Box de seriado com 8 dvds 4",
            "quantity": 2
        }
    ],
    "customer": {
        "id": "CUS-XMDK5GSBMY2J",
        "ownId": "cliente_teste",
        "fullname": "João Silva Teste",
        "createdAt": "2017-08-23T10:35:25.000-03",
        "updatedAt": "2021-09-10T09:10:50.474-03",
        "email": "joaosilva@email.com",
        "fundingInstrument": {
            "creditCard": {
                "id": "CRC-TI78DHREWJIX",
                "brand": "DINERS",
                "first6": "302000",
                "last4": "9828",
                "store": true
            },
            "method": "CREDIT_CARD"
        },
        "_links": {
            "self": {
                "href": "https://sandbox.moip.com.br/v2/customers/CUS-XMDK5GSBMY2J"
            },
            "hostedAccount": {
                "redirectHref": "https://hostedaccount-sandbox.moip.com.br?token=69ba3677-a465-4cf2-a42e-3f6e405654dc&id=CUS-XMDK5GSBMY2J&mpa=MPA-5E41545A052B"
            }
        },
        "fundingInstruments": [
            {
                "creditCard": {
                    "id": "CRC-L4H5AHK27T7Y",
                    "brand": "MASTERCARD",
                    "first6": "555566",
                    "last4": "8884",
                    "store": true
                },
                "method": "CREDIT_CARD"
            },
            {
                "creditCard": {
                    "id": "CRC-MSMBEKFM5FHG",
                    "brand": "VISA",
                    "first6": "402400",
                    "last4": "1516",
                    "store": true
                },
                "method": "CREDIT_CARD"
            },
            {
                "creditCard": {
                    "id": "CRC-TI78DHREWJIX",
                    "brand": "DINERS",
                    "first6": "302000",
                    "last4": "9828",
                    "store": true
                },
                "method": "CREDIT_CARD"
            }
        ]
    },
    "payments": [],
    "escrows": [],
    "refunds": [],
    "entries": [],
    "events": [
        {
            "type": "ORDER.CREATED",
            "createdAt": "2021-09-10T09:10:50.466-03",
            "description": ""
        }
    ],
    "receivers": [
        {
            "moipAccount": {
                "id": "MPA-5E41545A052B",
                "login": "diego@yami.com.br",
                "fullname": "Diego Yami"
            },
            "type": "PRIMARY",
            "amount": {
                "total": 14600,
                "currency": "BRL",
                "fees": 0,
                "refunds": 0
            },
            "feePayor": true
        }
    ],
    "_links": {
        "self": {
            "href": "https://sandbox.moip.com.br/v2/orders/ORD-V2QRVTPTCWBV"
        },
        "checkout": {
            "payCheckout": {
                "redirectHref": "https://checkout-new-sandbox.moip.com.br?token=2d8bd901-af81-40a1-80ce-0e8b25119926&id=ORD-V2QRVTPTCWBV"
            },
            "payCreditCard": {
                "redirectHref": "https://checkout-new-sandbox.moip.com.br?token=2d8bd901-af81-40a1-80ce-0e8b25119926&id=ORD-V2QRVTPTCWBV&payment-method=credit-card"
            },
            "payBoleto": {
                "redirectHref": "https://checkout-new-sandbox.moip.com.br?token=2d8bd901-af81-40a1-80ce-0e8b25119926&id=ORD-V2QRVTPTCWBV&payment-method=boleto"
            },
            "payOnlineBankDebitItau": {
                "redirectHref": "https://checkout-sandbox.moip.com.br/debit/itau/ORD-V2QRVTPTCWBV"
            }
        }
    }
}
 */