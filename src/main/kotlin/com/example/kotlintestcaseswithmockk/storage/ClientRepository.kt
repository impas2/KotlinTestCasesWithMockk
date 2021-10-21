package com.example.kotlintestcaseswithmockk.storage

import com.example.kotlintestcaseswithmockk.model.ClientEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository:JpaRepository<ClientEntity, Long> {
}