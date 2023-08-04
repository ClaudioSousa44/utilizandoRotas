package br.senai.sp.jandira.navegacao.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun ButtonMain(textButton: String, navController: NavController, nameScreen: String) {
    Button(
        onClick = { navController.navigate(nameScreen) },
        colors = ButtonDefaults.buttonColors(Color.White)
    )

    {
        Text(
            text = textButton,
            color = Color.Blue
        )
    }
}