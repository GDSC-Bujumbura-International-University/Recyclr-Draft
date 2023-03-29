package com.gdsc.recyclr.screens.shop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.gdsc.recyclr.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gdsc.recyclr.ui.theme.Gray_color
import com.gdsc.recyclr.ui.theme.Green_color
import com.gdsc.recyclr.ui.theme.RecyclrTheme
import com.gdsc.recyclr.ui.theme.Typography
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun ShopScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Gray_color),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
        ){
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.White)
                    .clip(RoundedCornerShape(12.dp))
            ){
                Column(
                    modifier = Modifier.padding(vertical = 14.dp),
                    //verticalArrangement = Arrangement.spacedBy(14.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.shopping_bag),
                        contentDescription = null,
                        modifier = Modifier.size(99.dp)
                    )
                    Text(
                        text = "Reusable Shopping Bag",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold

                    )
                    
                    Row() {
                        Text(
                            text = "150 coins",
                            fontSize = 12.sp,
                        )

                        Image(
                            modifier = Modifier.size(10.dp),
                            painter = painterResource(R.drawable.ic_google_icon),
                            contentDescription = "coins",
                        )
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Green_color)
                    ) {
                        Text(
                            text = stringResource(R.string.redeem),
                            fontSize = 15.sp,
                            color = Color.White
                        )
                    }
                }
            }
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.White)
                    .clip(RoundedCornerShape(12.dp))
            ){
                Column(
                    modifier = Modifier.padding(vertical = 14.dp),
                    //verticalArrangement = Arrangement.spacedBy(14.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.self_care_planner),
                        contentDescription = null,
                        modifier = Modifier.size(99.dp)
                    )
                    Text(
                        text = "The Self Care Planner",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold

                    )

                    Row() {
                        Text(
                            text = "200 coins",
                            fontSize = 12.sp,
                        )

                        Image(
                            modifier = Modifier.size(10.dp),
                            painter = painterResource(R.drawable.ic_google_icon),
                            contentDescription = "coins",
                        )
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Green_color)
                    ) {
                        Text(
                            text = stringResource(R.string.redeem),
                            fontSize = 15.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }

        Row(
            modifier = Modifier.fillMaxSize(),
        ){
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.White)
                    .clip(RoundedCornerShape(12.dp))
            ){
                Column(
                    modifier = Modifier.padding(vertical = 14.dp),
                    //verticalArrangement = Arrangement.spacedBy(14.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.plastic_bags),
                        contentDescription = null,
                        modifier = Modifier.size(99.dp)
                    )
                    Text(
                        text = "Plastic Bags Zero waste \n Box",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold

                    )

                    Row() {
                        Text(
                            text = "70 coins",
                            fontSize = 12.sp,
                        )

                        Image(
                            modifier = Modifier.size(10.dp),
                            painter = painterResource(R.drawable.ic_google_icon),
                            contentDescription = "coins",
                        )
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Green_color)
                    ) {
                        Text(
                            text = stringResource(R.string.redeem),
                            fontSize = 15.sp,
                            color = Color.White
                        )
                    }
                }
            }
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.White)
                    .clip(RoundedCornerShape(12.dp))
            ){
                Column(
                    modifier = Modifier.padding(vertical = 14.dp),
                    //verticalArrangement = Arrangement.spacedBy(14.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.bamboo_toothbrush),
                        contentDescription = null,
                        modifier = Modifier.size(99.dp)
                    )
                    Text(
                        text = "Virtue Brush",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold

                    )

                    Row() {
                        Text(
                            text = "50 coins",
                            fontSize = 12.sp,
                        )

                        Image(
                            modifier = Modifier.size(10.dp),
                            painter = painterResource(R.drawable.ic_google_icon),
                            contentDescription = "coins",
                        )
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Green_color)
                    ) {
                        Text(
                            text = stringResource(R.string.redeem),
                            fontSize = 15.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }

        Row(
            modifier = Modifier.fillMaxSize(),
        ){
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.White)
                    .clip(RoundedCornerShape(12.dp))
            ){
                Column(
                    modifier = Modifier.padding(vertical = 14.dp),
                    //verticalArrangement = Arrangement.spacedBy(14.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.shopping_bag),
                        contentDescription = null,
                        modifier = Modifier.size(99.dp)
                    )
                    Text(
                        text = "Reusable Shopping Bag",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold

                    )

                    Row() {
                        Text(
                            text = "150 coins",
                            fontSize = 12.sp,
                        )

                        Image(
                            modifier = Modifier.size(10.dp),
                            painter = painterResource(R.drawable.ic_google_icon),
                            contentDescription = "coins",
                        )
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Green_color)
                    ) {
                        Text(
                            text = stringResource(R.string.redeem),
                            fontSize = 15.sp,
                            color = Color.White
                        )
                    }
                }
            }
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .background(Color.White)
                    .clip(RoundedCornerShape(12.dp))
            ){
                Column(
                    modifier = Modifier.padding(vertical = 14.dp),
                    //verticalArrangement = Arrangement.spacedBy(14.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.self_care_planner),
                        contentDescription = null,
                        modifier = Modifier.size(99.dp)
                    )
                    Text(
                        text = "The Self Care Planner",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold

                    )

                    Row() {
                        Text(
                            text = "200 coins",
                            fontSize = 12.sp,
                        )

                        Image(
                            modifier = Modifier.size(10.dp),
                            painter = painterResource(R.drawable.ic_google_icon),
                            contentDescription = "coins",
                        )
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Green_color)
                    ) {
                        Text(
                            text = stringResource(R.string.redeem),
                            fontSize = 15.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
    /*val buja = LatLng(-3.361260, 29.347916)
    val cameraPositionState = rememberCameraPositionState{
        position = CameraPosition.fromLatLngZoom(buja,14f)
    }
    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState =cameraPositionState
    ){
        Marker(
            state = MarkerState(position = buja),
            title = "Bujumbura",
            snippet = "Marker in Bujumbura"
        )
    }*/
}

@Preview(showBackground = true)
@Composable
private fun PreviewShopScreen() {
    RecyclrTheme {
        ShopScreen()
    }
}