package com.aplikasimobile

sealed class Routes(val route: String){
    object Home : Routes("home")
    object Profile : Routes("profile")
    object Quiz : Routes("quiz")
    object Settings : Routes("setting")

}