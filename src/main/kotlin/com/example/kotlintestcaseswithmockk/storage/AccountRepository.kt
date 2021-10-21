package com.example.kotlintestcaseswithmockk.storage

import com.example.kotlintestcaseswithmockk.model.AccountEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository:JpaRepository<AccountEntity,String> {
}