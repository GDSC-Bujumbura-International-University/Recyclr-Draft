package com.gdsc.recyclr.screens.auths

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdsc.recyclr.components.ButtonComponent
import com.gdsc.recyclr.components.InputText

@Composable
fun ForgotPasswordScreen() {
    var email by remember { mutableStateOf("") }
    val focusManager = LocalFocusManager.current
    val scrollState = rememberScrollState()


    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Green)
            .padding(20.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "Forgot password",
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(60.dp))

        InputText(
            modifier = Modifier.fillMaxWidth(),
            value = email,
            onValueChange = {email = it},
            label = { Text("E-mail") },
            placeholder = { Text("Enter email") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email"
                )
            },

            keyboardActions = KeyboardActions(
                onDone = {
                    focusManager.clearFocus()
                }
            ),
            maxLines = 1
        )

        Spacer(modifier = Modifier.size(40.dp))
        ButtonComponent(
            text ="SUBMIT",
            onclick = {}
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewForgotPasswordScreen() {
    //ForgotPasswordScreen()
}