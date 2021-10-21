package com.example.kotlintestcaseswithmockk.storage

import com.example.kotlintestcaseswithmockk.model.PaymentEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository:JpaRepository<PaymentEntity, Long> {
}