package services

import au.com.bytecode.opencsv.CSVReader
import models.Answer
import models.Question
import org.springframework.stereotype.Service
import java.io.FileReader

@Service
class QuestionCSVServiceImpl : QuestionCSVService {

    override fun getQuestions(): List<Question> {
        val reader = CSVReader(
            FileReader("D:\\otus-spring\\1-Введение в Spring Framework\\spring-testing\\src\\main\\resources\\questions.csv"),
            ',', '"', 1)

        var nextLine: Array<String>?
        val questions = mutableListOf<Question>()
        while (reader.readNext().also { nextLine = it } != null) {
            if(nextLine != null) {
                questions.add(
                    Question(
                        nextLine!![0].toInt(),
                        nextLine!![1],
                        buildAnswers(nextLine!![2].split(";"))))
            }
        }

        return questions
    }

    private fun buildAnswers(answers: List<String>): List<Answer> {
        val result = mutableListOf<Answer>()
        answers.forEach { result.add(Answer(it)) }

        return result
    }
}
