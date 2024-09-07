package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
                ){
                    GreetingImage()
                    GreetingText(message = "¡¡Feliz Cumpleaños Edson!!", from = "From Edson", modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center, modifier = modifier) {
        Text(
            text = message,
            fontSize = 65.sp,
            color = Color(red = 255, blue = 255, green = 255),
            lineHeight = 86.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(0.dp,200.dp, 0.dp)
        )
        Text(
            text = from,
            fontSize = 36.sp,
            color = Color(red = 255, blue = 255, green = 255),
            modifier = Modifier
                .padding(20.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(){
    val imagen = painterResource(id = R.drawable.fondo)
    Image(painter = imagen,
          contentDescription = null
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejemplo1Theme {
        GreetingImage()
        GreetingText(message = "¡¡Feliz Cumpleaños Edson!!", from = "From Edson2", modifier = Modifier.padding(8.dp))
    }
}