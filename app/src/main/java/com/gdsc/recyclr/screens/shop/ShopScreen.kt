package com.gdsc.recyclr.screens.shop

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun ShopScreen() {
    /*Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "ShopScreen")
    }*/
    val buja = LatLng(-3.361260, 29.347916)
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
    }
}

@Preview(name = "ShopScreen")
@Composable
private fun PreviewShopScreen() {
    ShopScreen()
}