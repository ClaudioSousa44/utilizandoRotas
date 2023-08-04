package br.senai.sp.jandira.navegacao.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.navegacao.R

@Composable
fun MainScreen( backgroundColor: Color, title: String, textButton: String, navController: NavController, nameScreen: String) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        Text(
            text = title,
            color = Color.White,
            modifier = Modifier.padding(top = 30.dp),
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(250.dp))

        ButtonMain(textButton = textButton, navController, nameScreen)
    }
}