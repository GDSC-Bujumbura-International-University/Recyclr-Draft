@file:Suppress("UNUSED_EXPRESSION")

package com.gdsc.recyclr.components

import android.graphics.Color.parseColor
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.gdsc.recyclr.R
import com.gdsc.recyclr.ui.theme.Shapes

@Composable
fun CategoryCard(
    title: String,
    description: String,
    shape: Shape = Shapes.medium,
    padding: Dp = 5.dp,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = shape,
    )  {

        Row(
            modifier = Modifier
                .fillMaxWidth(6f)
                .padding(all = padding),
            verticalAlignment = Alignment.CenterVertically
        )  {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                ImageComponent(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(4.dp)),
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Product image"
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    ProductText(
                        title = title,
                        description = description )
                }
            }

            ButtonIcon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Keyboard Arrow Right"

            ) { onClick }

        }
    }
}

@Composable
fun ProductText(
    title: String,
    titleFontSize: TextUnit = MaterialTheme.typography.h6.fontSize,
    titleFontWeight: FontWeight = FontWeight.Bold,
    description: String,
    descriptionFontSize: TextUnit = MaterialTheme.typography.subtitle2.fontSize,
    descriptionFontWeight: FontWeight = FontWeight.Normal,
    descriptionMaxLines: Int = 1
){
    Text(
        modifier = Modifier.fillMaxWidth(fraction = 0.7f),
        text = title,
        fontSize = titleFontSize,
        fontWeight = titleFontWeight,
        maxLines = 1,
    )
    //Spacer(modifier = Modifier.padding(1.dp))
    Text(
        modifier = Modifier
            .fillMaxWidth(fraction = 0.9f),
        text = description,
        fontSize = descriptionFontSize,
        fontWeight = descriptionFontWeight,
        maxLines = descriptionMaxLines,
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewCategoryCard() {
    CategoryCard(
        title = "Plastic",
        description = "Discover paper recyclability ",
        onClick = {}
    )
}


val String.color
    get() = Color(parseColor(this))