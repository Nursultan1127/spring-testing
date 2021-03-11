package ru.otus

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy
import ru.otus.services.AuthorizationService
import ru.otus.services.QuestionCSVService
import ru.otus.services.SummarizeResultService
import ru.otus.services.TestingService

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
open class Main

fun main() {
    val context = AnnotationConfigApplicationContext(Main::class.java)

    val authorizationService = context.getBean(AuthorizationService::class.java)
    authorizationService.authorize()

    val questionCSVService = context.getBean(QuestionCSVService::class.java)
    val questions = questionCSVService.getQuestions()

    val testingService = context.getBean(TestingService::class.java)
    val result = testingService.testStudent(questions)

    val summarizeResultService = context.getBean(SummarizeResultService::class.java)
    println(summarizeResultService.summarizeResult(result))
}
