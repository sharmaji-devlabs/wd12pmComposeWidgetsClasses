package com.widgets.app.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.widgets.app.R

class ArrangementCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            VerticalArrangement()
//            HorizontalArrangement()
//            CustomGridArrange()
//            VerticalArrangementPropertyInColumnAndRow()
//            GridArrangementByColumnAndRow()

           Column(
               modifier = Modifier
                   .fillMaxWidth()
                   .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
           ) {
               Row(
                   modifier = Modifier.fillMaxWidth(),
                   horizontalArrangement = Arrangement.Center,
                   verticalAlignment = Alignment.CenterVertically
               ) {
                   Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.Gray)) {
                       Image(painterResource(R.drawable.facebook), contentDescription = "Facebook Icon")
                       Text("Facebook", color = Color.DarkGray)
                   }
                   Button(onClick = {}) {
                       Image(painterResource(R.drawable.google), contentDescription = "Google Icon")
                       Text("Google", color = Color.DarkGray)
                   }
               }
               Row(
//                   modifier = Modifier.fillMaxWidth()
               ) {
                   Text(text = "I am agree to the ")
                   Text(text = "Terms and Services", color = Color.Blue)
                   Text(text = "and")
                   Text("Privacy Policy", color = Color.Blue)
               }
           }
        }

    }
}

// Row and Column Compose for Arrange widgets in a single direction

// Example of Column
//@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun VerticalArrangement() {
    Column(

    ) {
        // write widgets here
        Text(text = "ONE", fontSize = 30.sp)
        Text(text = "TWO", fontSize = 30.sp)
        Text(text = "THREE",fontSize = 30.sp)
        Text(text = "FOUR", fontSize = 30.sp)
    }
}

@Composable
fun HorizontalArrangement(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .size(height = 400.dp, width = 300.dp)
            .background(Color.Cyan),
//        horizontalArrangement = Arrangement.End

        horizontalArrangement = Arrangement.SpaceAround,

        verticalAlignment = Alignment.CenterVertically

    ) {
        Image(painterResource(R.drawable.img), contentDescription = "Image")
        Image(painterResource(R.drawable.img), contentDescription = "Image")
        Image(painterResource(R.drawable.img), contentDescription = "Image")
        Image(painterResource(R.drawable.img), contentDescription = "Image")
    }
}

@Composable
fun CustomGridArrange(modifier: Modifier = Modifier) {
    Column() {
        HorizontalArrangement()
        HorizontalArrangement()
        HorizontalArrangement()
        HorizontalArrangement()
    }
}

@Composable
fun VerticalArrangementPropertyInColumnAndRow(modifier: Modifier = Modifier) {
    Column(
//        verticalArrangement = Arrangement.Bottom,
//        verticalArrangement = Arrangement.Top,
//        verticalArrangement = Arrangement.Center,
//        verticalArrangement = Arrangement.SpaceAround,
//        verticalArrangement = Arrangement.SpaceBetween,
        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally,
        horizontalAlignment = Alignment.End,
        modifier = modifier
            .size(height = 400.dp, width = 300.dp)
            .background(Color.Yellow)
    ) {
        Image(painterResource(R.drawable.img),contentDescription = "image",)
        Image(painterResource(R.drawable.img),contentDescription = "image",)
        Image(painterResource(R.drawable.img),contentDescription = "image",)
        Image(painterResource(R.drawable.img),contentDescription = "image",)

    }
}


@Composable
fun GridArrangementByColumnAndRow(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .size(height = 400.dp, width = 420.dp)
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = modifier.fillMaxWidth()
        ) {
            Image(painterResource(R.drawable.img), contentDescription = "")
            Image(painterResource(R.drawable.img), contentDescription = "")
            Image(painterResource(R.drawable.img), contentDescription = "")
            Image(painterResource(R.drawable.img), contentDescription = "")
        }
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painterResource(R.drawable.alien_svgrepo), contentDescription = "")
            Image(painterResource(R.drawable.alien_svgrepo), contentDescription = "")
            Image(painterResource(R.drawable.alien_svgrepo), contentDescription = "")
            Image(painterResource(R.drawable.alien_svgrepo), contentDescription = "")
        }
    }
}


