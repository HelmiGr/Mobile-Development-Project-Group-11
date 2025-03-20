package com.example.healiohealthapplication.ui.screens.login

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.healiohealthapplication.ui.components.BottomNavBar
import com.example.healiohealthapplication.ui.components.TopNavBar

@Composable
fun LoginScreen(navController: NavController, modifier: Modifier) {
    Scaffold(
        topBar = { TopNavBar("Login", navController) },
        bottomBar = { BottomNavBar(navController) }
    ) { innerPadding ->
        Text(
            text = "Login Screen!",
            modifier = Modifier.padding(innerPadding)
        )
    }
}