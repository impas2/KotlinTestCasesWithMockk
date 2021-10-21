package com.example.kotlintestcaseswithmockk.controller

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("payments")
class PaymentController {

    @GetMapping(value = ["/{paymentId}"])
    fun getPaymentById(@PathVariable("paymentId") paymentId:String) {

    }

}