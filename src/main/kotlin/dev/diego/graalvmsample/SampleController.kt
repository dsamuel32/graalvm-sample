package dev.diego.graalvmsample

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sample")
class SampleController {

    @RequestMapping
    fun get() = SampleResponse("Hello World!")

}

data class SampleResponse(val result: String)