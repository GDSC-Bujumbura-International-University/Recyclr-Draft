@file:Suppress("UNUSED_EXPRESSION")

package com.gdsc.recyclr.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonIcon(
    imageVector: ImageVector,
    contentDescription: String,
    onClickIcon: () -> Unit
){
    IconButton(

        onClick = {
            onClickIcon
        }) {
        Icon(
            imageVector = imageVector,
            contentDescription = contentDescription
        )
    }
}

@Preview(showBackground = true )
@Composable
private fun PreviewReusableImageVector() {
    ButtonIcon(
        imageVector = Icons.Default.KeyboardArrowRight,
        contentDescription = "Keyboard Arrow Right"

    ) {}
}