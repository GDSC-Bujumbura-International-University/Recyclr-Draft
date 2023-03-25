@file:Suppress("NAME_SHADOWING")

package com.gdsc.recyclr.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdsc.recyclr.ui.theme.Shapes


@ExperimentalMaterialApi
@Composable
fun ButtonAuth(
    modifier: Modifier = Modifier,
    icon: Int,
    contentDescription: String,
    shape: Shape = Shapes.medium,
    borderColor: Color = Color.LightGray,
    backgroundColor: Color = MaterialTheme.colors.surface,
    onClicked: () -> Unit
) {

    var clicked by remember { mutableStateOf(false) }

    Surface(
        onClick = { clicked = !clicked },
        shape = Shapes.medium,
        border = BorderStroke(width = 2.dp, color = Color.LightGray),
        color = MaterialTheme.colors.surface

    ) {

        Surface(
            modifier = modifier
                .clickable { clicked = !clicked },
            shape = shape,
            border = BorderStroke(width = 1.dp, color = borderColor),
            color = backgroundColor
        ) {
            Row(
                modifier = Modifier
                    .padding(all = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = contentDescription,
                    tint = Color.Unspecified
                )
                if (clicked) {
                    onClicked()
                }
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
@Preview
private fun GoogleButtonPreview() {
    ButtonAuth(
        icon = com.gdsc.recyclr.R.drawable.ic_google_icon,
        contentDescription = "Google Button",
        onClicked = {}
    )
}