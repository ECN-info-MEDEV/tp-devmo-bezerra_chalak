package com.example.projetmedev

import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Bienvenue dans notre service XXX! JOA et nos équipes vous accompagnent durant votre hospitalisation" +
                    "pour toujours plus de lien et bien-être",
            modifier = modifier,
            style = TextStyle(fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center,
        )
    }
}

    @Preview
    @Composable
    fun HomeScreenPreview(){
        HomeScreen(modifier= Modifier
            .padding(top = 16.dp, bottom = 16.dp)
            .align(Alignment.CenterHorizontally))

    }



