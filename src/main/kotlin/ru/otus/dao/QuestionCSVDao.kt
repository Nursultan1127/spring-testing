package ru.otus.dao

import ru.otus.models.Question

interface QuestionCSVDao {

    fun getQuestions() : List<Question>
}