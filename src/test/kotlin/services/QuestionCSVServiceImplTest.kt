package services

import dao.QuestionCSVDao
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import com.nhaarman.mockitokotlin2.whenever
import models.Answer
import models.Question
import org.junit.jupiter.api.Assertions

@ExtendWith(MockitoExtension::class)
internal class QuestionCSVServiceImplTest(@Mock private val dao: QuestionCSVDao) {

    private val service = QuestionCSVServiceImpl(dao)

    private val questions = mutableListOf<Question>()
    private val answers = mutableListOf<Answer>()

    @Test
    fun getQuestions() {
        whenever(dao.getQuestions()).thenReturn(prepareQuestion())
        Assertions.assertEquals(1,service.getQuestions().size)
    }

    private fun prepareQuestion(): MutableList<Question> {
        answers.add(Answer("5"))
        answers.add(Answer("7"))
        answers.add(Answer("7"))
        answers.add(Answer("8"))

        questions.add(Question(1, "How many continents are there in the world", answers))
        return questions
    }
}