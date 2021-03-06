import org.springframework.context.support.ClassPathXmlApplicationContext
import services.QuestionCSVDisplayService
import services.QuestionCSVService

fun main() {
    val context = ClassPathXmlApplicationContext("spring-context.xml")

    val questionCSVService = context.getBean(QuestionCSVService::class.java)
    val questions = questionCSVService.getQuestions()

    val questionCSVDisplayService = context.getBean(QuestionCSVDisplayService::class.java)
    questionCSVDisplayService.displayQuestions(questions)
}