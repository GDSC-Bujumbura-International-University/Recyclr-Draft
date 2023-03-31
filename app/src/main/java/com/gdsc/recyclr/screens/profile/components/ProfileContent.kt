package com.gdsc.recyclr.screens.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.gdsc.recyclr.R
import androidx.compose.ui.unit.sp
import com.gdsc.recyclr.ui.theme.Gray_color

@Composable
fun ProfileContent(
    padding: PaddingValues
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Gray_color)
            .padding(padding)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "Avatar",
            modifier = Modifier.size(200.dp)
        )
        Card(
            modifier = Modifier
                .height(150.dp)
                .padding(vertical = 30.dp),
            shape = RoundedCornerShape(12.dp)
            ) {
            Column(
                modifier = Modifier
                .padding(horizontal = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "John Doe",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
                Row() {
                    Text(text = "0")
                    Image(
                        painter = painterResource(id = R.drawable.coins),
                        contentDescription = "coins")
                }
            }
        }
    }
}