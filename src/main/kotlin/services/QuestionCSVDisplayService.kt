package services

import models.Question

interface QuestionCSVDisplayService {

    fun displayQuestions(questions: List<Question>)
}