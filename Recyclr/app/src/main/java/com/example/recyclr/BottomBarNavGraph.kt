package com.example.recyclr

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.recyclr.screens.HomeScreen
import com.example.recyclr.screens.ProfileScreen
import com.example.recyclr.screens.ScanScreen
import com.example.recyclr.screens.ShopScreen

@Composable
fun ButtomBarNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route,
    ){
        composable(
            route = BottomBarScreen.Home.route
        ){
            HomeScreen()
        }
        composable(
            route = BottomBarScreen.Scan.route
        ){
            ScanScreen()
        }
        composable(
            route = BottomBarScreen.Shop.route
        ){
            ShopScreen()
        }
        composable(
            route = BottomBarScreen.Profile.route
        ){
            ProfileScreen()
        }
    }
}