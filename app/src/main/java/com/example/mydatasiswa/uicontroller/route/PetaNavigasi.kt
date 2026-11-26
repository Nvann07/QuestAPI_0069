package com.example.mydatasiswa.uicontroller

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.mydatasiswa.uicontroller.route.DestinasiEntry
import com.example.mydatasiswa.view.EntrySiswaScreen

@Composable
fun DataSiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(navController = navController, modifier = modifier)
}


