@file:Suppress("UNUSED_EXPRESSION", "DEPRECATION")

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
import com.gdsc.recyclr.R
import com.gdsc.recyclr.components.composable.ButtonAuth
import com.gdsc.recyclr.components.composable.ButtonComponent
import com.gdsc.recyclr.components.composable.InputText
import com.gdsc.recyclr.navigation.AuthPage
import com.gdsc.recyclr.navigation.BottomBarPage

@ExperimentalMaterialApi
@Composable
fun LoginScreen(navController: NavController) {

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
            text = "Authentication",
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.size(60.dp))

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

        Spacer(modifier = Modifier.height(10.dp))

        // remember me and forget password
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                               /*Navigate to forgot screen */
                        navController.navigate(AuthPage.Forgot.route){
                            popUpTo = navController.graph.getStartDestination()
                            launchSingleTop = true
                        }},
                text = "Forgot password ",
                style = TextStyle(
                    color = MaterialTheme.colors.primary,
                )
            )

        }
        Spacer(modifier = Modifier.size(20.dp))

        // Login button
        ButtonComponent(
            text ="LOG IN",
            onclick = {
                navController.navigate(BottomBarPage.Home.route)
            }
        )
        Spacer(modifier = Modifier.height(50.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "or sign in with",
                fontWeight = FontWeight.W300
            )

            Spacer(modifier = Modifier.padding(30.dp))

            //login using google
            Row {

                ButtonAuth(
                    icon = R.drawable.ic_google_icon,
                    contentDescription = "Google Button",
                    onClicked = {
                        /*click*/
                       // navController.navigate(BottomBarPage.Home.route)
                    }
                )
                Spacer(modifier = Modifier.width(30.dp))
            }

            Spacer(modifier = Modifier.height(30.dp))

            // sign up text
            Row(
                modifier = Modifier
                    .padding(10.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "Don't you have an account?",
                )
                Spacer(modifier = Modifier.padding(3.dp))
                Text(
                    modifier = Modifier
                        .clickable {
                            /*Navigate to register screen */
                            navController.navigate(AuthPage.SignUp.route){
                                popUpTo = navController.graph.getStartDestination()
                                launchSingleTop = true
                            }
                        },
                    text = "Sign up ",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.primary,
                    )
                )

            }
        }

    }
}


@Preview(showBackground =  true)
@Composable
private fun PreviewLogin_screen() {
    //LoginScreen()
}