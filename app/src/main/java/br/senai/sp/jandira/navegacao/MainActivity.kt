package br.senai.sp.jandira.navegacao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import br.senai.sp.jandira.navegacao.login.LoginScreen
import br.senai.sp.jandira.navegacao.menu.MenuScreen
import br.senai.sp.jandira.navegacao.pedidos.PedidosScreen
import br.senai.sp.jandira.navegacao.perfil.PerfilScreen
import br.senai.sp.jandira.navegacao.ui.theme.NavegacaoTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
//import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavegacaoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ){
                        composable(route = "login"){
                        AnimatedVisibility(
                            visible = true,
                            enter = fadeIn()
                        ) {
                            LoginScreen(navController)
                        }

                        }
                        composable(route = "perfil"){ PerfilScreen(navController)}
                        composable(route = "menu"){ MenuScreen(navController)}
                        composable(route = "pedidos"){ PedidosScreen(navController = navController)}
                    }
                }
            }
        }
    }
}

