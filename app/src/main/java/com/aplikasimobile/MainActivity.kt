package com.aplikasimobile

import Quiz
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aplikasimobile.screens.Home
import com.aplikasimobile.screens.Profile
import com.aplikasimobile.screens.Settings
import com.aplikasimobile.ui.theme.AplikasiMobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AplikasiMobileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScreenMain()
                }
            }
        }
    }
}

@Composable
fun ScreenMain() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            Home(navController = navController)
        }
        composable(Routes.Profile.route) {
            Profile()
        }
        composable(Routes.Settings.route + "/{no}") { navBackStack ->
            val number = navBackStack.arguments?.getString("no")
            Settings(number = number)
        }
        composable(Routes.Quiz.route) {
            Quiz(navController = navController)
        }
    }
}