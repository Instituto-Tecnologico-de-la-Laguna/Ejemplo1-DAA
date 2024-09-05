package com.example.ejemplo1


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejemplo1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    // Genera el texto
                    GreetingText(
                        message = "Feliz Cumpleaños bendito Tec Laguna!",
                        from = "Gatos Negros!!!!",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }

    /*private fun Surface(modifier: Modifier, color: Any, function: @Composable () -> Unit) {

    }*/
}

@Composable
fun GreetingText(message: String, from:String, modifier: Modifier = Modifier) {

    // Creación de un gradiente
    val gradiente = Brush.verticalGradient(
        // Se hace una lista de colores para el gradiente
        colors = listOf(
            Color(0, 212, 255),
            Color(9, 9, 121),
            Color(2, 0, 36)
        )
    )


    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.background(brush = gradiente)
    ) {

        // Estilos del primer texto
        Text(
            text = message,
            fontSize = 100.sp,
            color = Color.White,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )

        // Estilos del segundo texto
        Text(
            text = from,
            fontSize = 36.sp,
            color = Color.White,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejemplo1Theme {
        GreetingText(
            message = "Feliz Cumpleaños bendito Tec Laguna!",
            from = " Gatos Negros"
        )
    }
}