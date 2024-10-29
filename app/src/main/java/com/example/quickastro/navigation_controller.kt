package com.example.quickastro

import otpScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quickastro.login.logout
import com.example.quickastro.login.mobile_login
import com.example.quickastro.login.profile
import com.example.quickastro.login.splashScreen
import com.example.quickastro.login.update_profile
import email_Login

@Composable
fun navigation(modifier: Modifier = Modifier) {

    val navcontrol = rememberNavController()
    NavHost(navController = navcontrol, startDestination = "email") {

        composable("email") { email_Login(navcontrol) }

        composable("mobileNo") { mobile_login(navcontrol) }

        composable("splash") { splashScreen(navcontrol) }

        composable("otp") { otpScreen(navcontrol) }

        composable("profile") { profile(navcontrol) }

        composable("update_profile") { update_profile(navcontrol) }

        composable("logout_screen") { logout(navcontrol) }
    }
}