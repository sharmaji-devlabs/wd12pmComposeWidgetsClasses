package com.widgets.app.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp


class TextComposeExample : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}

@Composable
fun TextCompose(name: String) {
    // Text Compose is used to render any Textual Information
    Text(
        text = "Hello $name!".repeat(10),
        fontSize = 30.sp, // font size will be in SP (like 10.sp)
        color = Color.Black, // Compose provide some built-in color

        letterSpacing = 0.5.em,

        fontStyle = FontStyle.Italic, // for apply text style like italic or normal
        fontWeight = FontWeight.W900, // to control fontweight

        textDecoration = TextDecoration.Underline, // to control line
        fontFamily = FontFamily.Cursive,
        lineHeight = 60.sp,
        textAlign = TextAlign.Center,
        maxLines = 4,
        minLines = 1,
        overflow = TextOverflow.Ellipsis,
        style = TextStyle() // to design Textstyle separately
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TextCompose(name = "Jetpack Compose")
//    AppBarTitle("Welcome".uppercase())

}

@Composable
private fun AppBarTitle(title : String) {
    Text(text = title, letterSpacing = 0.6.em, fontSize = 22.sp, textAlign = TextAlign.Center)
}