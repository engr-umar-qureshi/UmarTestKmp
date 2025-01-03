package org.umar.testkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform