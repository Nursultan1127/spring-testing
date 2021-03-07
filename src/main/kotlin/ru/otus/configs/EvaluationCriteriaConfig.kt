package ru.otus.configs

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component

@PropertySource("classpath:application.properties")
@Component
data class EvaluationCriteriaConfig(
    @Value("\${evaluation.criteria.a}")
    val a: Int,

    @Value("\${evaluation.criteria.b}")
    val b: Int,

    @Value("\${evaluation.criteria.c}")
    val c: Int
)