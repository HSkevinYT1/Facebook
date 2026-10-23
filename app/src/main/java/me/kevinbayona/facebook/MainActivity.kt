package me.kevinbayona.facebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.kevinbayona.facebook.ui.screens.FacebookLoginScreen
import me.kevinbayona.facebook.ui.screens.FacebookRegisterScreen
import me.kevinbayona.facebook.ui.screens.FeedScreen
import me.kevinbayona.facebook.ui.theme.FacebookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FacebookTheme {
                val myNavController = rememberNavController()
                NavHost(
                    navController = myNavController,
                    startDestination = "login",
                    modifier = Modifier.fillMaxSize()
                ) {
                    composable(route = "login") {
                        FacebookLoginScreen(
                            onClickRegister = {
                                myNavController.navigate("register")
                            },
                            onClickIniciarSesion = {
                                myNavController.navigate("feed") {
                                    popUpTo("login") {
                                        inclusive = true
                                    }
                                }
                            }
                        )
                    }
                    composable(route = "register") {
                        FacebookRegisterScreen(
                            onClicBack = {
                                myNavController.popBackStack()
                            }
                        )
                    }
                    composable(route = "feed") {
                        FeedScreen()
                    }
                }
            }
        }
    }
}
