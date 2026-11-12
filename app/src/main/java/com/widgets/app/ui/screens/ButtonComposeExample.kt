package com.widgets.app.ui.screens

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.widgets.app.R

class ButtonComposeExample : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column() {
                SimpleButtonCompose(
                    label = "Button 1",
                    color = Color.Blue,
                    onClickEvent = {
                        Toast.makeText(
                            this@ButtonComposeExample,
                            "Button Compose 1",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                )
                ButtonWithMultipleText()
                ButtonWithTextAndIcon()
//                SimpleButtonCompose(
//                    label = "Button 2",
//                    color = Color.Black,
//                    onClickEvent = { // lambda function
//                        Toast.makeText(
//                            this@ButtonComposeExample,
//                            "Button Compose 2",
//                            Toast.LENGTH_SHORT
//                        ).show()
//                    }
//                )

//                SimpleButtonCompose(
//                    label = "Button 3",
//                    onClickEvent = {
//
//                    }
//                )
            }
        }
    }
}

//@Preview
// simple text button
@Composable
private fun SimpleButtonCompose(
    onClickEvent: () -> Unit,
    label: String,
    color: Color = Color.Yellow
) {
    Button(
//        onClick = { // onclick is a callback inside button compose for onclick event
//            Toast.makeText(context, "Button Compose", Toast.LENGTH_SHORT).show()
//        },
        onClick = onClickEvent, // making dependent onclick method (example of higher order function)
        modifier = Modifier.size(300.dp, 100.dp),
        enabled = true, // used for enable of disable button
//        colors = ButtonDefaults.buttonColors(Color.Black), // to set button color
//        colors = ButtonDefaults.buttonColors(color),
//        shape = ButtonDefaults.outlinedShape
//        shape = RectangleShape,
//        shape = RoundedCornerShape(18.dp),
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 30.dp,
            focusedElevation = 20.dp,
            pressedElevation = 20.dp
        ),
        border = BorderStroke(width = 5.dp, color = Color.Black)
    ) {
        Text(label, fontSize = 30.sp)
    }
}


@Composable
fun ButtonWithMultipleText(modifier: Modifier = Modifier) {
    Button(
        onClick = {}
    ) {
        Text("Click ", color = Color.Blue, fontSize = 30.sp)
        Text("Me !", color = Color.White, fontSize = 30.sp)
    }
}

@Composable
fun ButtonWithTextAndIcon(modifier: Modifier = Modifier) {
    Button(
        onClick = {}
    ) {
        Image(
            painterResource(R.drawable.alien_svgrepo), contentDescription = "Trying SVG Icon",
            colorFilter = ColorFilter.tint(Color.Red),
        )
        Text("Me !", color = Color.White, fontSize = 30.sp)
    }
}
