package ru.otus.studenttesting.services

import org.springframework.stereotype.Service
import ru.otus.services.AuthorizationService
import ru.otus.services.QuestionCSVService
import ru.otus.services.SummarizeResultService
import ru.otus.services.TestingService

@Service
class FakeControllerServiceImpl(
    private val authorizationService: AuthorizationService,
    private val questionCSVService: QuestionCSVService,
    private val testingService: TestingService,
    private val summarizeResultService: SummarizeResultService
) : FakeControllerService {

    override fun testStudent() {
        authorizationService.authorize()

        val questions = questionCSVService.getQuestions()
        val result = testingService.testStudent(questions)

        println(summarizeResultService.summarizeResult(result))
    }
}