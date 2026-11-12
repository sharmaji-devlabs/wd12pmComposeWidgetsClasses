package com.widgets.app.ui.screens

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.widgets.app.R

@Composable
fun IconComposeExample(painter: Painter){
    Icon(
        painter = painter,
//        painterResource(R.drawable.alien_svgrepo),
        contentDescription = "",
        tint = Color.Green
    )
}

@Composable
fun IconWithMaterialIcon(icon: ImageVector, modifier: Modifier = Modifier) {
    Icon(
        imageVector = icon,
        contentDescription = null,
        modifier.size(40.dp)
    )
}