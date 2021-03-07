package ru.otus.services

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import ru.otus.configs.EvaluationCriteriaConfig

@ExtendWith(MockitoExtension::class)
class SummarizeResultServiceTest {

    private val criteria: EvaluationCriteriaConfig = EvaluationCriteriaConfig(5,4,3) // пока не нашел как исправить
    private val service = SummarizeResultServiceImpl(criteria)

    @Test
    fun summarizeResult() {
        val result = service.summarizeResult(5)

        Assertions.assertEquals("Congratulations! You have passed the exam! Your grade is A", result)
    }
}