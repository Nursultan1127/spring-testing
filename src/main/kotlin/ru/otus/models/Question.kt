package ru.otus.models


data class Question(
    val id: Int,
    val description: String,
    val answers: List<Answer>,
    val rightAnswer: Answer)
