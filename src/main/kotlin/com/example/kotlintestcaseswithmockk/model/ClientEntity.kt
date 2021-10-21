package com.example.kotlintestcaseswithmockk.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class ClientEntity {
    @Id
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    var name: String? = null
    var address: String? = null

    @OneToMany()
    lateinit var accounts: List<AccountEntity>

}