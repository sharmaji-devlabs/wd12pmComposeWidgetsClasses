package com.widgets.app.screens

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            FirstComponent()
//            Text(text = "Jetpack Compose", color = Color.Black)
//            Text(text = "Android Development")

        }
    }
}

@Preview(name = "Home Screen", showSystemUi = true)
@Composable
fun FirstComponent(title : String = "Harshit Mehta"){
    Text(text = "Your name is $title")
}

@Preview(name = "Note Info Dialog", showSystemUi = false, widthDp = 250, heightDp = 350,)
@Composable
fun FirstComponent2(title : String = ""){
    Text(text = "Your name is $title")
}


@Preview(name = "Note Card")
@Composable
fun FirstComponent3(title : String = "",){
    Text(text = "Your name is $title")
}

@Preview(name = "Component 1")
@Composable
fun FirstComponent4(title : String = ""){
    Text(text = "Your name is $title")
}

//@Preview
//@Composable
//fun showOutput() {
//    FirstComponent("Harshit Mehta")
//}





