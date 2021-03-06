package services

import models.Question

class QuestionCSVDisplayServiceImpl: QuestionCSVDisplayService {

    override fun displayQuestions(questions: List<Question>) {
        for(i in 0 until questions.size) {
            println(questions[i].description)
            for(j in 0 until questions[i].answers.size) {
                print(questions[i].answers[j].description)
            }

            println()
            println()
        }
    }
}