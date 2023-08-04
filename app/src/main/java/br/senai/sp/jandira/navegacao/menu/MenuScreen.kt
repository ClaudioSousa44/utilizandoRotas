package br.senai.sp.jandira.navegacao.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.navegacao.R
import br.senai.sp.jandira.navegacao.components.ButtonMain

@Composable
fun MenuScreen(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.menu),
            color = Color.White,
            modifier = Modifier.padding(top = 30.dp)
        )

        Spacer(modifier = Modifier.height(100.dp))

        ButtonMain(textButton = stringResource(id = R.string.perfil ),navController,"perfil"  )
        Spacer(modifier = Modifier.height(250.dp))
        ButtonMain(textButton = stringResource(id = R.string.pedidos ),navController, "pedidos" )
        ButtonMain(textButton = stringResource(R.string.sair), navController, "login")


    }
}

