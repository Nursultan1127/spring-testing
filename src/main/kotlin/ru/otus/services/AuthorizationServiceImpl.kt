package ru.otus.services

import org.springframework.stereotype.Service
import java.util.*

@Service
class AuthorizationServiceImpl : AuthorizationService {

    private val scan = Scanner(System.`in`)

    override fun authorize() {
        print("Enter your first name: ")
        val firstName = scan.nextLine()

        print("Enter your second name: ")
        val secondName = scan.nextLine()
    }
}