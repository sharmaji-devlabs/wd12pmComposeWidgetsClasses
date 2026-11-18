package com.widgets.app.ui.screens.form_validation_with_regex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class RegistrationScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            RegistrationForm(
                Modifier
                    .safeDrawingPadding()
                    .padding(horizontal = 25.dp, vertical = 20.dp)
            )

        }

    }
}

@Composable
fun TitleCompose(text: String, modifier: Modifier = Modifier) {
    Text(
        text,
        style = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.ExtraBold, color = Color.Black),
        modifier = modifier
    )
}

@Composable
fun RegistrationForm(modifier: Modifier = Modifier) {

    var formState = listOf(
        "fullName" to remember { mutableStateOf("") },
        "username" to remember { mutableStateOf("") },
        "emailId" to remember { mutableStateOf("") },
        "password" to remember { mutableStateOf("") },
        "cnfPassword" to remember { mutableStateOf("") }
    )

    Column(modifier = modifier.fillMaxSize()) {
        TitleCompose(
            "Registration Form",
            modifier = Modifier
                .padding(bottom = 20.dp)
                .align(Alignment.CenterHorizontally)
        )
        InputField(label = "Full Name", state = "", onValueChange = { value ->

        })
        InputField(label = "Username", state = "", onValueChange = { value ->

        })
        InputField(label = "Phone Number ", state = "", onValueChange = { value ->

        })
        InputField(label = "Email Id", state = "", onValueChange = { value ->

        })
        InputField(label = "Password", state = "", onValueChange = { value ->

        })
        InputField(label = "Confirm Password", state = "", onValueChange = { value ->

        })

    }
}

@Composable
fun InputField(
    label: String,
    state: String,
    onValueChange: (String) -> Unit,
    textInputType: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
    placeHolder: String = "",
    modifier: Modifier = Modifier
) {
    Column(modifier.padding(vertical = 10.dp)) {
        Text(label, style = labelStyle, modifier = paddingB10)
        OutlinedTextField(
            value = state,
            modifier = Modifier.fillMaxWidth(1f),
            onValueChange = onValueChange,
            keyboardOptions = textInputType
        )
    }
}

private val labelStyle =
    TextStyle(
        fontSize = 18.sp,
        color = Color.Gray,
        textAlign = TextAlign.Start,
        fontWeight = FontWeight(600),
    )


private val paddingB10 = Modifier.padding(bottom = 10.dp)


class RegexValidation {
    companion object {
        val FULLNAME = Regex("^[a-zA-Z]+(?:[ '-][a-zA-Z]+)*$")

        val USERNAME = Regex("^[a-zA-Z0-9_]{3,20}$")

        val EMAILID = Regex(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
        )

        val CONTACT = Regex("^[6-9][0-9]{9}$")

        val PASSWORD = Regex(
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$"
        )
    }
}




