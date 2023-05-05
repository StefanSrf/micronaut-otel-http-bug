package com.example

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller
class DemoController {

    @Get("/testEndpoint")
    fun testEndpoint(
    ): HttpResponse<String> {
        return HttpResponse.ok("test")
    }
}
