package com.example.kotlintestcaseswithmockk.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Account {

    @Id
    val number:String?=generateNumber()

    val currency:String="RU"
    val amount:String="0"
    
    fun generateNumber():String = UUID.randomUUID().toString()
}