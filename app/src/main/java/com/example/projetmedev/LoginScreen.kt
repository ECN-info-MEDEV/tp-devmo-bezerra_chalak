
package com.example.projetmedev

import android.app.AlertDialog
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetmedev.data.emailPasswordMap
import com.example.projetmedev.ui.theme.ColorPalette

var showError by mutableStateOf(false)
var checked by mutableStateOf(false)
@Composable

fun LoginScreen(modifier: Modifier = Modifier,
                email: String,
                onValueChange: (String) -> Unit,
                )

{

    Image(
        modifier = modifier,
        painter = painterResource(id = R.drawable.logom),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.5F
    )

    Box(
        modifier = Modifier
            .fillMaxWidth() // Define a largura máxima do Box
            .height(40.dp) // Define a altura do Box como 100dp
            .background(ColorPalette.Bleue), // Define a cor de fundo como azul
        contentAlignment = Alignment.Center // Alinha o conteúdo ao centro vertical e horizontalmente
    ) {
        Text(
            text = "Lien et bien-être en milieu hospitalier",
            style = TextStyle(fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp) // Adiciona padding horizontal para espaçamento
        )
    }
    Text(
        text = "Créer un compte",
        modifier = modifier,
        color = ColorPalette.Jaune,
        style = TextStyle(fontWeight = FontWeight.Bold),
        textAlign = TextAlign.Center
    )
    Text(
        text = "Votre adresse mail",
        modifier = modifier,
        style = TextStyle(fontWeight = FontWeight.Bold),
        textAlign = TextAlign.Center
    )
    OutlinedTextField(
        value = email,
        onValueChange = onValueChange,
        singleLine = true,
        shape = MaterialTheme.shapes.large,
        label = { Text(text = "Digitez votre mail") },
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            disabledContainerColor = MaterialTheme.colorScheme.surface,
            focusedBorderColor = ColorPalette.Jaune,
            unfocusedBorderColor = ColorPalette.Jaune,
        )
    )
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Créez un mot de passe",
            modifier = modifier,
            style = TextStyle(fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center
        )
        Text(
            text = "(Le mot de pass doit contenir au minimum 8 caractères)",
            modifier = modifier,
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = TextUnit(12f, TextUnitType.Sp))
        )
    }
    if (showError) {
        Text(
            text = "Informations d'identification incorrectes. \nVeuillez vérifier et réessayer.",
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color.Red,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(top = 8.dp)
        )
    }
}




@Composable
fun PasswordandButton(
    modifier: Modifier,
    password: String,
    onValueChange: (String) -> Unit,

){
    OutlinedTextField(value = password, onValueChange = onValueChange, singleLine = true, shape = MaterialTheme.shapes.large, label = { Text(text = "Digitez votre mot de passe") }, colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            disabledContainerColor = MaterialTheme.colorScheme.surface,
            focusedBorderColor = ColorPalette.Jaune,
            unfocusedBorderColor = ColorPalette.Jaune,
        ), visualTransformation = PasswordVisualTransformation(), keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password))


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
            style= TextStyle(fontSize = TextUnit(14f, TextUnitType.Sp))
        )
    }


}


@Composable
fun LoginButton(
    onNextButtonClicked: () -> Unit,
    modifier: Modifier,
    email: String,
    password: String,

){
    Button(
        colors = ButtonDefaults.buttonColors(containerColor = ColorPalette.Jaune),
        onClick = {

            if (CheckLoginAndPassword(email, password)) {
                onNextButtonClicked()
            } else {
                showError = true;
            }
        },
        enabled = checked
    ) {
        Text(
            text = "Login",
            fontSize = 18.sp
        )
    }
}






fun CheckLoginAndPassword(email: String, password: String): Boolean{
    val storedPassword = emailPasswordMap[email]
    return storedPassword == password
}





