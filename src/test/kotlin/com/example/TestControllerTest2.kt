package com.example

import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@MicronautTest
internal class TestControllerTest2(
    @Client("/") val client: HttpClient
) {

    @Test
    fun `should respond to testEndpoint`() {
        val response = client.toBlocking().exchange<String>("/testEndpoint")
        assertEquals(200, response.status.code)
    }

    @Test
    fun `should respond to testEndpoint2`() {
        val response = client.toBlocking().exchange<String>("/testEndpoint")
        assertEquals(200, response.status.code)
    }
}
