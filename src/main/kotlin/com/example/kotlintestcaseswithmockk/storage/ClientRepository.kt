package com.example.kotlintestcaseswithmockk.storage

import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository:JpaRepository<ClientRepository, Long> {
}