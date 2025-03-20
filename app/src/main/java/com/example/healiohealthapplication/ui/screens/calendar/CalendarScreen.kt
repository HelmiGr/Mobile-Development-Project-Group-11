package com.example.healiohealthapplication.ui.screens.calendar

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.healiohealthapplication.ui.components.BottomNavBar
import com.example.healiohealthapplication.ui.components.TopNavBar

@Composable
fun CalendarScreen(navController: NavController, modifier: Modifier) {
    Scaffold(
        topBar = { TopNavBar("Calendar", navController) },
        bottomBar = { BottomNavBar(navController) }
    ) { innerPadding ->
        Text(
            text = "Calendar Screen!",
            modifier = Modifier.padding(innerPadding)
        )
    }
}