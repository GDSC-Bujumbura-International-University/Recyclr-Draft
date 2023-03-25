package com.gdsc.recyclr.navigation.nav_graph

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gdsc.recyclr.navigation.AuthPage
import com.gdsc.recyclr.screens.auths.ForgotPasswordScreen
import com.gdsc.recyclr.screens.auths.LoginScreen
import com.gdsc.recyclr.screens.auths.RegisterScreen


@ExperimentalMaterialApi
@Composable
fun SetupAuthNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = AuthPage.SignIn.route
    ) {
        composable(route = AuthPage.SignIn.route) {
            LoginScreen(navController = navController)

        }
        composable(route = AuthPage.SignUp.route) {
            RegisterScreen(navController = navController)
        }
        composable(route = AuthPage.Forgot.route) {
            ForgotPasswordScreen()
        }
    }
}
