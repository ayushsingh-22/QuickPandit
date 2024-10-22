package com.example.quickastro

import LoginScreen
import LoginScreen2
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quickastro.login.logout
import com.example.quickastro.login.profile
import com.example.quickastro.login.update_profile
import splashScreen

@Composable
fun navigation(modifier: Modifier = Modifier) {

    val navcontrol = rememberNavController()
    NavHost(navController = navcontrol, startDestination = "splash") {

        composable("home") { LoginScreen(navcontrol) }

        composable("splash") { splashScreen(navcontrol) }

        composable("otp") { LoginScreen2(navcontrol) }

        composable("profile") { profile(navcontrol) }

        composable("update_profile") { update_profile(navcontrol) }

        composable("logout_screen") { logout(navcontrol) }
    }
}