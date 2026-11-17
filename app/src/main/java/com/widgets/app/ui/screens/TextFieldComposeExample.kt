package com.widgets.app.ui.screens

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextFieldComposeExample : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                Modifier.safeDrawingPadding()
            ) {
                TextFieldCompose()
            }
        }
    }
}


@Composable
fun TextFieldCompose(modifier: Modifier = Modifier) {
    /*
        There are two types of TextField in Compose
            -> TextFiled
            -> OutlinedTextField
        Note : TextFiled is a state (data) driven Compose
     */
//    var state = remember { mutableStateOf("") }
    var state by remember { mutableStateOf<String>("") }
    var contact by remember { mutableStateOf("") }
    Column() {
        TextField(
            value = state,
            onValueChange = {
                state = it
                Log.d("VALUE", state)
            },
            // just like hint
//            placeholder = {
//                Text("Full name")
//            },
            label = {
                Row() {
//                    IconWithMaterialIcon(Icons.Outlined.Person)
                    Text("Full name")
                }
            },

            leadingIcon = {
                IconWithMaterialIcon(Icons.Outlined.Person)

            },
        )

        Text(state, modifier.padding(top = 50.dp), fontSize = 18.sp)

        // keyboard option example
        OutlinedTextField(
            value = contact,
            onValueChange = {
                contact = it
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            prefix = { Text("+91") },
        )

        Text(contact, modifier.padding(top = 50.dp), fontSize = 18.sp)

    }


}