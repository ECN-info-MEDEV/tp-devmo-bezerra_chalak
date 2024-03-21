package com.example.projetmedev

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetmedev.ui.theme.ColorPalette

@Composable
fun HomeScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Bienvenue dans notre service XXX! JOA et nos équipes vous accompagnent durant votre hospitalisation" +
                    "pour toujours plus de lien et bien-être",
            modifier= Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
            style = TextStyle(fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center,
        )
        Text(
            text = "Choisissez et planifiez des activités avec nos intervenants qualifiés, selon vos besoins :",
            modifier= Modifier
                .background(ColorPalette.Bleue)
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
            style = TextStyle(fontWeight = FontWeight.Bold),
            color=ColorPalette.Jaune,
            textAlign = TextAlign.Center,
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier= Modifier
                .background(ColorPalette.BleueFoncee).fillMaxWidth()

        ){
            Button(
                colors = ButtonDefaults.buttonColors(containerColor = ColorPalette.Jaune),
                onClick = { }
            ) {
                Text(
                    text = "Me distraire",
                    fontSize = 18.sp,
                    color= Black
                )
            }
            Button(
                colors = ButtonDefaults.buttonColors(containerColor = ColorPalette.Jaune),
                onClick = { }
            ) {
                Text(
                    text = "Etre apaisé(e)",
                    fontSize = 18.sp,
                    color= Black
                )
            }
            Button(
                colors = ButtonDefaults.buttonColors(containerColor = ColorPalette.Jaune),
                onClick = { }
            ) {
                Text(
                    text = "M'instruire",
                    fontSize = 18.sp,
                    color= Black
                )
            }
            Button(
                colors = ButtonDefaults.buttonColors(containerColor = ColorPalette.Jaune),
                onClick = { }
            ) {
                Text(
                    text = "Etre soutenu(e)",
                    fontSize = 18.sp,
                    color= Black
                )
            }

        }
    }
}

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun HomeScreenPreview(){
        HomeScreen()
    }




