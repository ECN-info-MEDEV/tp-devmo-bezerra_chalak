package com.example.projetmedev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.projetmedev.ui.theme.ColorPalette
import com.example.projetmedev.ui.theme.ProjetMedevTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetMedevTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Title(modifier= Modifier
                            .background(ColorPalette.Bleue)
                            .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                            .align(Alignment.CenterHorizontally)
                            .fillMaxWidth())
                        CompteCreation(modifier= Modifier
                            .padding(top = 16.dp, bottom = 16.dp)
                            .align(Alignment.CenterHorizontally))
                        AdresseMail(modifier= Modifier
                            .padding(top = 16.dp, bottom = 16.dp)
                            .align(Alignment.CenterHorizontally))

                        EmailTextField(modifier= Modifier
                            .padding(top = 16.dp, bottom = 16.dp)
                            .align(Alignment.CenterHorizontally))
                        MotDePass(modifier= Modifier
                            .padding(top = 16.dp, bottom = 16.dp)
                            .align(Alignment.CenterHorizontally))
                        PasswordTextField(modifier= Modifier
                            .padding(top = 16.dp, bottom = 16.dp)
                            .align(Alignment.CenterHorizontally))
                    }

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
fun AdresseMail(modifier: Modifier = Modifier) {
    Text(
        text = "Votre adresse mail",
        modifier = modifier,
        style = TextStyle(fontWeight = FontWeight.Bold),
        textAlign = TextAlign.Center
    )
}

@Composable
fun EmailTextField(modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = "",
        onValueChange = { },
        singleLine = true,
        shape = MaterialTheme.shapes.large,
        label = { Text(text= "Digitez votre mail") },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            disabledContainerColor = MaterialTheme.colorScheme.surface,
        )
    )
}

@Composable
fun PasswordTextField(modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = "",
        onValueChange = { },
        singleLine = true,
        shape = MaterialTheme.shapes.large,
        label = { Text(text= "Digitez votre mot de passe") },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            disabledContainerColor = MaterialTheme.colorScheme.surface,
        )
    )
}


@Composable
fun MotDePass(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Créez un mot de pass",
            modifier = modifier,
            style = TextStyle(fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center
        )
        Text(
            text = "(Le mot de pass doit contenir au minimum 8 caractères)",
            modifier = modifier,
            textAlign = TextAlign.Center,
            style=TextStyle(fontSize = TextUnit(12f, TextUnitType.Sp))
        )

    }

}

@Composable
fun Conditions(modifier: Modifier = Modifier) {
    var checked by remember { mutableStateOf(false) }
    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it },
           // colors = CheckboxDefaults.colors(MaterialTheme.colors.primary)
        )
        Text(
            text = "J'ai lu et j'accepte les conditions d'utilisation et la politique de confidentialité",
            modifier = modifier,
            textAlign = TextAlign.Center,
            style=TextStyle(fontSize = TextUnit(14f, TextUnitType.Sp))
        )


    }

}

@Composable
fun Title(modifier: Modifier = Modifier) {

        Text(
            text = "Lien et bien-être en milieu hospitalier",
            modifier = modifier,
            style = TextStyle(fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center,
        )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ProjetMedevTheme {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Title(modifier= Modifier
                .background(ColorPalette.Bleue)
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth())
            CompteCreation(modifier= Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally))
            AdresseMail(modifier= Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally))
            EmailTextField(modifier= Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally))
            MotDePass(modifier= Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally))
            PasswordTextField(modifier= Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally))
            Conditions()
        }

    }
}