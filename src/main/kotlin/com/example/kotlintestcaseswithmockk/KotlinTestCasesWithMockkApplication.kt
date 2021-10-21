package com.example.kotlintestcaseswithmockk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class KotlinTestCasesWithMockkApplication

fun main(args: Array<String>) {
    runApplication<KotlinTestCasesWithMockkApplication>(*args)
}
