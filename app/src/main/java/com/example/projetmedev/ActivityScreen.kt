package com.example.projetmedev

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetmedev.ui.theme.ColorPalette

@Composable
fun ActivityScreen(
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier
){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier= Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
            painter = painterResource(id = R.drawable.logom),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        Text(
            text = "ACTIVITÉS",
            modifier= Modifier
                .background(ColorPalette.Bleue)
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
            style = TextStyle(fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center,
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier= Modifier
                .background(ColorPalette.BleueFoncee)
                .fillMaxWidth()

        ){
            Button(modifier= Modifier
                .padding(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = ColorPalette.Jaune),
                onClick = { onNextButtonClicked() }
            ) {
                Text(
                    text = "Retour",
                    fontSize = 18.sp,
                    color= Color.Black
                )
            }

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ActivityScreenPreview(){
    ActivityScreen(modifier = Modifier)
}