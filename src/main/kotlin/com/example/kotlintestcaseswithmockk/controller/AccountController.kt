package com.example.kotlintestcaseswithmockk.controller

import com.example.kotlintestcaseswithmockk.model.AccountCreateRequest
import com.example.kotlintestcaseswithmockk.model.AccountCreateResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("account")
class AccountController {

    @PostMapping(value = ["/create"],
    consumes = ["application/json"],
    produces = ["application/json"])
    fun createAccount(@RequestBody body:AccountCreateRequest): Mono<AccountCreateResponse> {
        return Mono.just(AccountCreateResponse())
    }

}