package com.example.kotlintestcaseswithmockk.model

import java.util.*
import javax.persistence.*

@Entity
class AccountEntity {

    @Id
    val number:String?=generateNumber()

    val currency:String="RU"
    var amount:String="0"

    @ManyToOne()
    @JoinColumn(name = "client.id")
    lateinit var owner:ClientEntity

    fun generateNumber():String = UUID.randomUUID().toString()
}