@file:Suppress("UNUSED_EXPRESSION")

package com.gdsc.recyclr.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonComponent(text: String, onclick: () -> Unit){

        Button(
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.secondary

            ),
            onClick = { onclick },
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
        ) {
            Text(
                text = text,
                fontSize = 20.sp,
                color = MaterialTheme.colors.surface
            )
        }

}

@Preview(showBackground = true)
@Composable
private fun PreviewButtonComponent() {
    ButtonComponent(
        text = "Login",
        onclick = {}
    )
}