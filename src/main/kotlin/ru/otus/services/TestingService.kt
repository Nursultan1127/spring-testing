package ru.otus.services

import ru.otus.models.Question

interface TestingService {

    fun testStudent(questions: List<Question>) : Int
}