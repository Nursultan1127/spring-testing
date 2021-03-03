package services

import dao.QuestionCSVDao
import models.Question
import org.springframework.stereotype.Service

@Service
class QuestionCSVServiceImpl(private val dao: QuestionCSVDao) : QuestionCSVService {

    override fun getQuestions(): List<Question> {
        return dao.getQuestions()
    }
}
