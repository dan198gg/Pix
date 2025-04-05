package com.example.pix.ui


sealed class ClassesMain(val route: String) {
    object PhotosScreen : ClassesMain("photos_screen")
    object CurrentPhotoScreen : ClassesMain("current_photo_screen")
}