package com.widgets.app.screens

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.widgets.app.R
import com.widgets.app.screens.ui.theme.ComposeWidgetsClassesTheme

class ModifiersExamplesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val scrollState: ScrollState = rememberScrollState()
//            ModiferCompose(this@ModifiersExamplesActivity)
            VerticalScrollableCompose(modifier = Modifier.verticalScroll(scrollState))
        }
    }
}

//@Preview
@Composable
private fun ModiferCompose(context: Context) {

    Column(
//        Modifier.padding(50.dp)
        Modifier
            .fillMaxSize(1f) // 1.0f 100% width & height | 0.1f => 10% of width & height
            .padding(
                horizontal = 30.dp,
                vertical = 60.dp
            ) // controlling padding (controlling outer padding)
//            .size(400.dp) // controlling column sizes (both width & height)
            .background(Color.Cyan) // managing background color
            .border(3.dp, Color.Black)
            .padding(20.dp) // controlling inner padding


    ) {
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .clickable() {
                    Toast.makeText(context, "Custom Toast", Toast.LENGTH_SHORT).show()
                }
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )

        Image(
            painterResource(R.drawable.img),
            contentDescription = "Circular Image",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )

        Image(
            painterResource(R.drawable.alien_svgrepo),
            contentDescription = "Icon",
            modifier = Modifier
                .scale(2f)
                .alpha(0.5f)
                .rotate(180f)
        )


    }
}

@Composable
fun VerticalScrollableCompose(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp) // outer padding
                .background(Color.Yellow)
//                .size(width = 200.dp, height = 50.dp)
                .padding(12.dp, 8.dp) // inner padding
            ,
            fontSize = 32.sp
        )
    }

}


/*
What is Modifier?
    A Modifier elements is used to add behavior to Compose UI elements. i.e., Padding, background color, onClickEvent, sizes,colors,etc...

 */