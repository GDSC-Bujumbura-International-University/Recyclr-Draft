package com.gdsc.recyclr.navigation

sealed class AuthPage(val route: String){

    object SignIn: AuthPage("signIn_screen")
    object SignUp: AuthPage("signUp_screen")
    object Forgot : AuthPage("forgotPassword_screen")
}
