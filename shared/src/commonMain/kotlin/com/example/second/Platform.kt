package com.example.second

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform