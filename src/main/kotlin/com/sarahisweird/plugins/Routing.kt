package com.sarahisweird.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respond("Hello, world! :D")
        }

        get("/foo") {
            call.respond("foobar")
        }
    }
}
