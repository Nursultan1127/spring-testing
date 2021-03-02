import models.Question
import org.springframework.context.support.ClassPathXmlApplicationContext
import services.QuestionCSVService

fun main() {

    val context = ClassPathXmlApplicationContext("spring-context.xml")

    val questionCSVService = context.getBean(QuestionCSVService::class.java)
    val questions = questionCSVService.getQuestions()
    displayQuestions(questions)
}

private fun displayQuestions(questions: List<Question>) {

    for(i in 0 until questions.size) {
        println(questions[i].description)
        for(j in 0 until questions[i].answers.size) {
            print(questions[i].answers[j].description)
        }

        println()
        println()
    }
}