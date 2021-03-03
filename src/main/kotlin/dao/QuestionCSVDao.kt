package dao

import models.Question

interface QuestionCSVDao {

    fun getQuestions() : List<Question>
}