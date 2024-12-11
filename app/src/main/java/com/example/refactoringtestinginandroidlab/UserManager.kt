package com.example.refactoringtestinginandroidlab

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class UserManager(
    private val validator: UserValidator,
    private val repository: UserRepository,
    private val emailService: EmailService
) {
    fun registerUser(
        data: UserRegistrationData,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        val error = validator.validate(data)
        if (error != null) {
            onError(error)
            return
        }
        val user = User(data.firstName, data.lastName, data.email, data.password, data.age)
        repository.save(user)
        emailService.sendWelcomeEmail(data.email)
        onSuccess()
    }
}
