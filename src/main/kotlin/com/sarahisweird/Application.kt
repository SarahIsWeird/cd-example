package com.sarahisweird

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.sarahisweird.plugins.*

fun main() {
    val isProd = System.getenv("SERVER_MODE") == "production"
    val port = if (isProd) 80 else 8080

    embeddedServer(Netty, port = port, host = "0.0.0.0", module = Application::module)
            .start(wait = true)
}

fun Application.module() {
    configureHTTP()
    configureRouting()
}
