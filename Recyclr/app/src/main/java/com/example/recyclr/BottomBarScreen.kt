package com.example.recyclr

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Outlined.Home
    )

    object Scan : BottomBarScreen(
        route = "scan",
        title = "Scan",
        icon = Icons.Default.AddCircle
    )

    object Shop : BottomBarScreen(
        route = "shop",
        title = "Shop",
        icon = Icons.Default.ShoppingCart
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Outlined.AccountCircle
    )
}
