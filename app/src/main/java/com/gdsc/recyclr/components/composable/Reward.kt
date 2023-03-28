package com.gdsc.recyclr.components.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdsc.recyclr.R

@Composable
fun Reward(
    /*modifier: Modifier = Modifier,
    title: String,
    count: Int?,
    pointText: String?,
    weeklyText: String?,*/
) {


    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(),
    ) {
        Card(
            modifier = Modifier
                .padding(10.dp).clip(RoundedCornerShape(8.dp))
                .fillMaxWidth().background(Color.Cyan),
        ) {

            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                ImageComponent(
                    modifier = Modifier
                        .background(color = Color.Yellow)
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(
                            width = 5.dp,
                            color = Color.Green,
                            shape = CircleShape),
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "profile image"
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "You've earned"
                    )
                    Text(
                        text = "106"
                    )
                    Text(
                        text = "Points"
                    )
                    Text(
                        text = "12 points last week"
                    )
                }
            }

        }
    }
}

@Preview(name = "Reward")
@Composable
private fun PreviewReward() {
    Reward()
}