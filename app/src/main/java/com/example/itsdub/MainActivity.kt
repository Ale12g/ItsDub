package com.example.itsdub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PlantScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun PlantScreen(modifier: Modifier = Modifier) {
    var inputText by remember { mutableStateOf("") }
    var resultText by remember { mutableStateOf("Введите букву и нажмите кнопку") }



}

fun checkPlant(input: String): String {
    val letter = input.lowercase()

    return when (letter) {
        "d" -> "Это Дуб"
        "" -> "Поле пустое. Введите букву."
        else -> "Неизвестное растение (введена буква: $input)"
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PlantScreenPreview() {
    MaterialTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            PlantScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}