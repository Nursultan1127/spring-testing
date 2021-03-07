package ru.otus.configs

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component

@PropertySource("classpath:application.properties")
@Component
class CSVFileConfig {

    @Value("\${csv.path}")
    lateinit var csvPath: String
}