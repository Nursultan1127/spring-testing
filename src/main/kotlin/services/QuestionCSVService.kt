package services

import models.Question


interface QuestionCSVService {

    fun getQuestions() : List<Question>
}