package com.example.kotlintestcaseswithmockk.storage

import com.example.kotlintestcaseswithmockk.model.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository:JpaRepository<Account,String> {
}