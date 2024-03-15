package com.example.projetmedev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projetmedev.ui.theme.ProjetMedevTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetMedevTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Title(modifier= Modifier
                        .background(Color.Blue.copy(alpha = 0.5f))
                        .padding(start = 16.dp, end = 166.dp, top = 16.dp, bottom = 16.dp))
                    CompteCreation(modifier=Modifier.padding(top = 16.dp, bottom = 16.dp))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun CompteCreation(modifier: Modifier = Modifier) {
        Text(
            text = "Créer un compte",
            modifier = modifier,
            color=Color.Yellow,
            style = TextStyle(fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center
        )
}

@Composable
fun Title(modifier: Modifier = Modifier) {
    Box {
        Text(
            text = "Lien et bien-être en milieu hospitalier",
            modifier = modifier,
            style = TextStyle(fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjetMedevTheme {
        Column(verticalArrangement = Arrangement.Center) {
            Title(modifier= Modifier
                .background(Color.Blue.copy(alpha = 0.5f))
                .padding(start = 16.dp, end = 166.dp, top = 16.dp, bottom = 16.dp))
            CompteCreation(modifier=Modifier.padding(top = 16.dp, bottom = 16.dp))
        }

    }
}