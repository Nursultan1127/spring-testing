package ru.otus.services

import org.springframework.stereotype.Service
import ru.otus.dao.QuestionCSVDao
import ru.otus.models.Question

@Service
class QuestionCSVServiceImpl(private val dao: QuestionCSVDao) : QuestionCSVService {

    override fun getQuestions(): List<Question> {
        return dao.getQuestions()
    }
}
