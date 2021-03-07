package ru.otus.services

import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import ru.otus.dao.QuestionCSVDao
import utils.Util.Companion.prepareQuestions

@ExtendWith(MockitoExtension::class)
internal class QuestionCSVServiceImplTest(@Mock private val dao: QuestionCSVDao) {

    private val service = QuestionCSVServiceImpl(dao)

    @Test
    fun getQuestions() {
        whenever(dao.getQuestions()).thenReturn(prepareQuestions())
        Assertions.assertEquals(1,service.getQuestions().size)
    }
}