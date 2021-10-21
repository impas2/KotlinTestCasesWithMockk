package com.example.kotlintestcaseswithmockk.model

import java.time.LocalDateTime
import java.time.OffsetDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class PaymentEntity {
    @Id
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    var payerId: String? = null
    var recipientId: String? = null
    var amount: String? = null

    var created: OffsetDateTime? = null
    var updated: OffsetDateTime? = null
    var operationTime: OffsetDateTime? = null


}