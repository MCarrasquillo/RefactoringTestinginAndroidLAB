package com.example.refactoringtestinginandroidlab

object Database {
    private val users = mutableListOf<User>()

    fun saveUser(user: User) {
        users.add(user)
    }

    fun getUserByEmail(email: String): User? {
        return users.find { it.email == email }
    }
}