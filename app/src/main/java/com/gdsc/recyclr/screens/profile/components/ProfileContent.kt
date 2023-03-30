package com.gdsc.recyclr.screens.profile.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileContent(
    padding: PaddingValues
) {
    Box(
        modifier = Modifier.fillMaxSize().padding(padding).padding(20.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(
            text = "ProfileScreen",
            fontSize = 24.sp
        )
    }
}