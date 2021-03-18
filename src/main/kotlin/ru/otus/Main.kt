package ru.otus

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy
import ru.otus.services.AuthorizationService
import ru.otus.services.QuestionCSVService
import ru.otus.services.SummarizeResultService
import ru.otus.services.TestingService
import ru.otus.studenttesting.services.FakeControllerService

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
open class Main

fun main() {
    val context = AnnotationConfigApplicationContext(Main::class.java)
    val bean = context.getBean(FakeControllerService::class.java)
    bean.testStudent()

}
