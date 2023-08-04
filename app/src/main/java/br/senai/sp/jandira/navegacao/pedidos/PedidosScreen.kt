package br.senai.sp.jandira.navegacao.pedidos

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import br.senai.sp.jandira.navegacao.R
import br.senai.sp.jandira.navegacao.components.MainScreen

@Composable
fun PedidosScreen(navController: NavController) {
    MainScreen(
        backgroundColor = Color.Gray,
        title = stringResource(R.string.pedidos) ,
        textButton =  stringResource(id = R.string.voltar),
        navController,
        "menu")
}

