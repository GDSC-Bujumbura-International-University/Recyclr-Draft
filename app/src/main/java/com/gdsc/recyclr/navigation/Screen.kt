@file:Suppress("unused")

package com.gdsc.recyclr.navigation

const val ROOT_ROUTE = "root"
const val AUTHENTICATION_ROUTE = "authentication"
const val HOME_ROUTE = "home"
const val FORGOT_ROUTE = "forgot"
const val DETAILS_ROOT = "details"

sealed class Screen(val route: String){
    object Home: Screen("home_screen")
    object Scan: Screen("Scan_screen")
    object Shop: Screen("shop_screen")
    object Profile: Screen("profile_screen")

    object Details: Screen("details_screen")

    object SignIn: Screen("signIn_screen")
    object SignUp: Screen("signUp_screen")
    object Forgot : Screen("forgotPassword_screen")
}
