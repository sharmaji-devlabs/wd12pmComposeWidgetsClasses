package com.widgets.app.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.widgets.app.R
import com.widgets.app.ui.theme.ComposeWidgetsClassesTheme

class TextSpanComposeExample : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // NOTE : USE AnnotateString instead of this
            Column(
                modifier = Modifier.safeDrawingPadding()
            ) {
                Row() {
                    Text(text = "HELLO", style = TextStyle(fontSize = 48.sp, color = Color.Red))
                    Text(text = "WORLD", style = TextStyle(fontSize = 48.sp, color = Color.Green))

                }

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontSize = 48.sp, color = Color.DarkGray
                            )
                        ) {
                            append("JetPack")
                        }

                        append("   ")

                        withStyle(
                            style = SpanStyle(
                                fontSize = 48.sp,
                                color = Color.Black
                            )
                        ) {
                            append("Compose")
                        }

                        append("  Development")
                    },
                    style = TextStyle(fontSize = 48.sp)
                )

                Row() {
                    IconComposeExample(painterResource(R.drawable.alien_svgrepo))
                    IconWithMaterialIcon(Icons.Default.CheckCircle)
                    IconWithMaterialIcon(Icons.Default.Create)
                    IconWithMaterialIcon(Icons.Default.Home)
                    IconWithMaterialIcon(Icons.Default.Call)
                }

                Row() {
                    IconWithMaterialIcon(
                        icon = Icons.Outlined.Home
                    )
                    IconWithMaterialIcon(
                        icon = Icons.Outlined.Call
                    )
                    IconWithMaterialIcon(Icons.Outlined.Edit)
                }

                Row() {
                    IconWithMaterialIcon(Icons.Rounded.Home)
                    IconWithMaterialIcon(Icons.Rounded.Edit)
                    IconWithMaterialIcon(Icons.Rounded.Call)
                }

                Column() {
                    Button(onClick = {}) {
                        Text("Click Me!")
                    }

                    TextButton(onClick = {}) {
                        Text("Normal Text Button", fontSize = 25.sp)
                    }

                    ElevatedButton(onClick = {}) {
                        Text("Elevated Button")
                    }

                    IconButton(onClick = {}) {
                        IconComposeExample(painterResource(R.drawable.google))
                    }

                    CardComposeExample()

                }

            }
        }
    }
}
