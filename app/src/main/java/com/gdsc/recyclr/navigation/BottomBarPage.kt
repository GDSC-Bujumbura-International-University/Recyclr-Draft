package com.gdsc.recyclr.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarPage(
    val route: String,
    val title: String,
    val icon: ImageVector,
){
    object Home: BottomBarPage(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Scan: BottomBarPage(
        route = "scan",
        title = "Scan",
        icon = Icons.Default.Face
    )
    object Shop: BottomBarPage(
        route = "shop",
        title = "SHop",
        icon = Icons.Default.Share
    )
    object Profile: BottomBarPage(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

}
