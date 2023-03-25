
package com.gdsc.recyclr.components

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InputText(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    maxLines: Int = Int.MAX_VALUE,
    colors: TextFieldColors = TextFieldDefaults.outlinedTextFieldColors()
) {
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = value)) }
    val textFieldValue = textFieldValueState.copy(text = value)

    OutlinedTextField(
        value = textFieldValue,
        onValueChange = {
            textFieldValueState = it
            if (value != it.text) {
                onValueChange(it.text)
            }
        },
        modifier = modifier,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        maxLines = maxLines,
        colors = colors
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewMyInputText() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize().verticalScroll(scrollState)
            .background(Color.White)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        val focusManager = LocalFocusManager.current
        var passwordVisibility by remember { mutableStateOf(false) }

        val icon = if(passwordVisibility)
            painterResource(id = com.gdsc.recyclr.R.drawable.ic_visibility_off)
        else
            painterResource(id = com.gdsc.recyclr.R.drawable.ic_visibility)


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
            keyboardOptions = KeyboardOptions (
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }
            ),
            maxLines = 1
        )

        Spacer(modifier = Modifier.height(10.dp))
        InputText(
            modifier = Modifier.fillMaxWidth(),
            value = password,
            onValueChange = {password = it},
            label = { Text("Password") },
            placeholder = { Text("Enter password") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Email"
                )
            },

            visualTransformation = if (passwordVisibility) VisualTransformation.None
            else PasswordVisualTransformation(),

            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Visibility"
                    )
                }
            },
            keyboardOptions = KeyboardOptions (
                keyboardType = KeyboardType.Password ,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    focusManager.clearFocus()
                }
            ),
            maxLines = 1
        )
    }
}

