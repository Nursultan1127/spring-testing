package ru.otus.services

import ru.otus.models.Question


interface QuestionCSVService {

    fun getQuestions() : List<Question>
}