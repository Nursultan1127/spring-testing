package ru.otus.aspects

import mu.KLogging
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAspect {

    @Before("execution(* ru.otus.dao.QuestionCSVDaoImpl.*(..))")
    fun logBefore(joinPoint: JoinPoint) {
        logger.info {  }

        println("Прокси: ${joinPoint.javaClass.name}")
        println("Класс: ${joinPoint.target.javaClass.name}")
        println("Вызов метода: ${joinPoint.signature.name}")
    }

    private companion object : KLogging()
}