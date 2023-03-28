@file:Suppress("DEPRECATION")

package com.gdsc.recyclr.screens.auths

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gdsc.recyclr.R
import com.gdsc.recyclr.components.composable.ButtonAuth
import com.gdsc.recyclr.components.composable.ButtonComponent
import com.gdsc.recyclr.components.composable.InputText


@ExperimentalMaterialApi
@Composable
fun RegisterScreen(navController: NavController) {

    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    val focusManager = LocalFocusManager.current
    val scrollState = rememberScrollState()

    var passwordVisibility by remember { mutableStateOf(false) }
    val icon = if(passwordVisibility)
        painterResource(id = R.drawable.ic_visibility_off)
    else
        painterResource(id = R.drawable.ic_visibility)
    
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Green)
            .padding(20.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = " Create account ",
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.size(60.dp))

        InputText(
            modifier = Modifier.fillMaxWidth(),
            value = name,
            onValueChange = {name = it},
            label = { Text("Full name") },
            placeholder = {
                Text("Enter full name") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person"
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
                    contentDescription = "Lock"
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

        Spacer(modifier = Modifier.size(40.dp))
        ButtonComponent(
            text ="SIGN UP",
            onclick = {}
        )
        Spacer(modifier = Modifier.height(80.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "or sign up with",
                fontWeight = FontWeight.W300
            )

            Spacer(modifier = Modifier.height(30.dp))
            Row {

                ButtonAuth(
                    icon = R.drawable.ic_google_icon,
                    contentDescription = "Google Button",
                    onClicked = {}
                )
                Spacer(modifier = Modifier.width(30.dp))
            }

            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .padding(10.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Already have an account?",
                )
                Spacer(modifier = Modifier.padding(3.dp))
                Text(
                    modifier = Modifier
                        .clickable {
                            /*Navigate to register screen */
                            navController.popBackStack()
                        },
                    text = "Sign in ",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.primary,
                    )
                )
            }

        }

    }
}

@ExperimentalMaterialApi
@Preview(name = "Register_screen")
@Composable
private fun PreviewRegister_screen() {
    RegisterScreen(navController = rememberNavController())
}