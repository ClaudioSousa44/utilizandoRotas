package br.senai.sp.jandira.navegacao.login

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.navegacao.R
import br.senai.sp.jandira.navegacao.components.MainScreen

@Composable
fun LoginScreen(navController: NavController) {
    MainScreen(backgroundColor = Color.Red,
        title = stringResource(id = R.string.login) ,
        textButton =  stringResource(
        id = R.string.entrar
    ),
        navController,
        "menu")
}

