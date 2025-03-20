package com.example.healiohealthapplication.models

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavTabItem (
    var label: String,
    var icon: ImageVector,
    var route: String
)