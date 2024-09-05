package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText ( message = "Feliz cumpleaños Tec Laguna",
                                   from = "de: Layla",
                                   modifier = Modifier.padding(8.dp) )
                }
            }
        }
    }

    //private fun Surface(modifier:Modifier, color: Any, function: @Composable ()->Unit ) {
    //}
}

@Composable
fun GreetingText(message:String, from:String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier) {

        Text(
            text = message,
            fontSize = 65.sp,
            lineHeight = 85.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = from,
            fontSize = 45.sp,
            modifier = Modifier.padding(16.dp).align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)

@Composable
fun GreetingPreview() {
    Ejemplo1Theme {
        GreetingText( message = "Feliz cumpleaños Tec Laguna!", from = "de: Layla")
    }
}