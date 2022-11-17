package com.sarahisweird

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun `root should return Hello World`() = testApplication {
        // Set up the test application
        application {
            module()
        }

        // Make the actual request

        val response = client.get("/")

        // Compare the response to the expected values

        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Hello, world! :D", response.bodyAsText())
    }
}