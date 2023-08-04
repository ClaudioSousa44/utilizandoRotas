package br.senai.sp.jandira.navegacao.perfil

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import br.senai.sp.jandira.navegacao.R
import br.senai.sp.jandira.navegacao.components.MainScreen

@Composable
fun PerfilScreen(navController: NavController) {
    MainScreen(
        backgroundColor = Color.Green,
        title = stringResource(R.string.perfil) ,
        textButton = stringResource(R.string.voltar),
        navController,
        "menu"
    )
}

