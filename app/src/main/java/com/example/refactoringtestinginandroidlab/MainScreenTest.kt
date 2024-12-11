package com.example.refactoringtestinginandroidlab
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun error_message_shown_for_invalid_input() {
        composeTestRule.setContent {
            MainScreen()
        }

        composeTestRule.onNodeWithText("Register").performClick()
        composeTestRule.onNodeWithText("All fields must be filled").assertExists()
    }
}