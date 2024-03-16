package com.example.projetmedev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    var emailInput by remember { mutableStateOf("") }
                    var passwordInput by remember { mutableStateOf("") }
                    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Logo(modifier= Modifier
                            .padding(top = 16.dp, bottom = 16.dp)
                            .align(Alignment.CenterHorizontally))
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

                        EmailTextField(
                            email = emailInput,
                            onValueChange = { emailInput = it},
                            modifier= Modifier
                                .padding(top = 16.dp, bottom = 16.dp)
                                .align(Alignment.CenterHorizontally))
                        MotDePass(modifier= Modifier
                            .padding(top = 16.dp, bottom = 16.dp)
                            .align(Alignment.CenterHorizontally))
                        PasswordTextField(
                            password = passwordInput,
                            onValueChange = { passwordInput = it},
                            modifier= Modifier
                                .padding(top = 16.dp, bottom = 16.dp)
                                .align(Alignment.CenterHorizontally))
                        Conditions(modifier= Modifier
                            .padding(top = 16.dp, bottom = 16.dp)
                            .align(Alignment.CenterHorizontally))
                    }

                }
            }
        }
    }
}
@Composable
fun Logo(modifier: Modifier = Modifier){
    Image(
        modifier=modifier,
        painter = painterResource(id = R.drawable.logo),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.5F
    )
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
        color=ColorPalette.Jaune,
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
fun EmailTextField(
    email: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = email,
        onValueChange = onValueChange,
        singleLine = true,
        shape = MaterialTheme.shapes.large,
        label = { Text(text= "Digitez votre mail") },
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            disabledContainerColor = MaterialTheme.colorScheme.surface,
            focusedBorderColor = ColorPalette.Jaune,
            unfocusedBorderColor = ColorPalette.Jaune,
        )
    )
}

@Composable
fun PasswordTextField(
    password: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier) {

    OutlinedTextField(
        value = password,
        onValueChange = onValueChange,
        singleLine = true,
        shape = MaterialTheme.shapes.large,
        label = { Text(text= "Digitez votre mot de passe") },
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            disabledContainerColor = MaterialTheme.colorScheme.surface,
            focusedBorderColor = ColorPalette.Jaune,
            unfocusedBorderColor = ColorPalette.Jaune,
        ),
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password)
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
            colors = CheckboxDefaults.colors(MaterialTheme.colorScheme.primary)
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
fun CreerCompteButton (modifier: Modifier = Modifier){
    Button(
        colors = ButtonDefaults.buttonColors(containerColor = ColorPalette.Jaune),
        onClick = { }
    ) {
        Text(
            text = "Creer Compte",
            fontSize = 18.sp
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
        var emailInput by remember { mutableStateOf("") }
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Logo(modifier= Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally))
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
            EmailTextField(
                email = emailInput,
                onValueChange = { emailInput = it},
                modifier= Modifier
                    .padding(top = 16.dp, bottom = 16.dp)
                    .align(Alignment.CenterHorizontally))
            MotDePass(modifier= Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally))
            PasswordTextField(
                password = emailInput,
                onValueChange = { emailInput = it},
                modifier= Modifier
                    .padding(top = 16.dp, bottom = 16.dp)
                    .align(Alignment.CenterHorizontally))
            Conditions(modifier= Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally))
            CreerCompteButton(modifier= Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally))
        }

    }
}