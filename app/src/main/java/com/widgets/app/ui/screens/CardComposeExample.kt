package com.widgets.app.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.widgets.app.R

@Composable
fun CardComposeExample(modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(15.dp).height(65.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(Color.White),
        shape = CircleShape,
        border = BorderStroke(
            width = 2.dp, color = Color.DarkGray
        )
    ) {
        Row(
            modifier.padding(12.dp)
        ) {
            Icon(painter = painterResource(R.drawable.google), contentDescription = null, Modifier.size(34.dp))
            Text("Google", fontSize = 34.sp)
        }
    }
}