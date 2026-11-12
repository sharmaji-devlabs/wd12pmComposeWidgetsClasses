package com.widgets.app.ui.screens.safewithnotcharea

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MakeUiWithSafeAreaFromNotch : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            DummyListCompose()
        }
    }


}

@Composable
fun DummyListCompose(modifier: Modifier = Modifier) {
    Column(modifier = modifier
//        .safeDrawingPadding()
        .statusBarsPadding()
        .fillMaxSize(1f)
        .padding(horizontal = 15.dp)) {
        for (i in 1..10){
            Text(text = "Hello world $i",
                modifier = YellowTextModifier(),
                style = CustomTextStyle())
        }
    }
}

fun CustomTextStyle() : TextStyle = TextStyle(fontSize = 28.sp, color = Color.Red)
fun YellowTextModifier(): Modifier = Modifier
    .fillMaxWidth(1f)
    .padding(12.dp)
    .height(60.dp)
    .background(Color.Yellow)
