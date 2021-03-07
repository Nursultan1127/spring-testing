package utils

import ru.otus.models.Answer
import ru.otus.models.Question

class Util {

    companion object {
        private val questions = mutableListOf<Question>()

        fun prepareQuestions(): MutableList<Question> {
            val answers = mutableListOf<Answer>()
            answers.add(Answer("5"))
            answers.add(Answer("7"))
            answers.add(Answer("7"))
            answers.add(Answer("8"))

            questions.add(Question(1, "How many continents are there in the world", answers, Answer("7")))
            return questions
        }
    }
}