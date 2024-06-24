package dev.diego.graalvmsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraalvmSampleApplication

fun main(args: Array<String>) {
    runApplication<GraalvmSampleApplication>(*args)
}
