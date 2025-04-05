package com.example.pix.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavHostMain(viewModel: MainViewModel){
val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ClassesMain.PhotosScreen.route) {

        composable(ClassesMain.PhotosScreen.route) {
            PhotosScreen(viewModel,navController)
        }


        composable(ClassesMain.CurrentPhotoScreen.route) {
            CurrentPhotoScreen(viewModel)
        }

    }
}