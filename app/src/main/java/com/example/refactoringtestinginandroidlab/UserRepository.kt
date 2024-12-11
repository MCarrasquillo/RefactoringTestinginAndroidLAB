package com.example.refactoringtestinginandroidlab

class UserRepository(private val database: Database) {
    fun save(user: User) = database.saveUser(user)
    fun getByEmail(email: String) = database.getUserByEmail(email)
}
