package com.example.refactoringtestinginandroidlab
import junit.framework.Assert.assertTrue
import junit.framework.Assert.fail
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.kotlin.mock
import org.mockito.kotlin.any

class UserManagerTest {

    @Test
    fun registerUser_should_succeed_with_valid_data() {
        // Mock dependencies
        val validator: UserValidator = mock()
        val repository: UserRepository = mock()
        val emailService: EmailService = mock()

        // Mock validator behavior
        `when`(validator.validate(any())).thenReturn(null)

        // Initialize UserManager with mocked dependencies
        val manager = UserManager(validator, repository, emailService)

        // Define valid user data
        val validUserData = UserRegistrationData(
            firstName = "John",
            lastName = "Doe",
            email = "john.doe@example.com",
            password = "Password123",
            age = 25
        )

        // Test registerUser method
        manager.registerUser(validUserData, onSuccess = {
            assertTrue(true)
        }, onError = {
            fail("Should not fail")
        })
    }

}
