package com.example.refactoringtestinginandroidlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.refactoringtestinginandroidlab.ui.theme.RefactoringTestingInAndroidLABTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RefactoringTestingInAndroidLABTheme{
                MainScreen()
            }
        }
    }
}