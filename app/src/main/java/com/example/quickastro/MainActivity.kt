package com.example.quickastro

import LoginScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.quickastro.ui.theme.QuickAstroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuickAstroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    navigation()
//                    update_profile()
//                    logout()
                }
            }
        }
    }
}
