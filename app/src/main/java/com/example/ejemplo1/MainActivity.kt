package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.res.painterResource
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
                    GreetingImage()
                    BirthdayText(message = "Feliz Cumpleaños Jimmy", from = "Travis Scott")
                }
            }
        }
    }




    @Composable
    fun BirthdayText(message: String, from: String, modifier: Modifier = Modifier) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(
                text = message,
                fontSize = 55.sp,
                lineHeight = 65.sp,
                textAlign = TextAlign.Center

            )

            Text(
                text = from,
                fontSize = 25.sp,
                modifier = Modifier.padding(16.dp).align(alignment = Alignment.End)
            )
        }

    }

    @Composable
    fun GreetingImage(){
        val image = painterResource(id = R.drawable.abstraction_paint_colorful_overlay)
        Image(painter = image, contentDescription = null)
    }

    @Preview(showBackground = true)
    @Composable
    fun BirthCardPreview(){
        Ejemplo1Theme {
            GreetingImage()
            BirthdayText(message = "Feliz cumpleaños, Jimmy!", from = "Travis Scott")
        }
    }
}