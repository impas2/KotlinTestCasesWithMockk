package com.example.kotlintestcaseswithmockk.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class ClientEntity {
    @Id
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    var name:String?=null
    var address:String?=null

}