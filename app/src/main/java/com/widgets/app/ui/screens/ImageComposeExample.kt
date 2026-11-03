package com.widgets.app.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.widgets.app.R
import com.widgets.app.ui.screens.ui.theme.ComposeWidgetsClassesTheme

class ImageComposeExample : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            ImageCompose()
            IconCompose()
        }
    }
}

// Image Compose
//@Preview(showSystemUi = true)
@Composable
fun ImageCompose() {
    Image(
        painterResource(R.drawable.img),
        contentDescription = "Image Compose",
//        modifier = Modifier.size(200.dp).padding(12.dp)
        contentScale = ContentScale.Fit
    )

}

@Preview
@Composable
private fun IconCompose() {
    Image(
        painterResource(R.drawable.alien_svgrepo), contentDescription = "Trying SVG Icon",
        colorFilter = ColorFilter.tint(Color.Red),
    )
}
