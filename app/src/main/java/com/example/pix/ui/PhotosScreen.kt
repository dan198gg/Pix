package com.example.pix.ui

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil3.compose.AsyncImage
import com.example.pix.R
import com.example.pix.data.flickr.mapper.toEntity

@Composable
fun PhotosScreen(viewModel: MainViewModel, navHostController: NavHostController) {
    LazyVerticalGrid( columns = GridCells.Adaptive(minSize = 50.dp)){

        items(viewModel.snapshotStateList) { photo ->
            AsyncImage(
                modifier = Modifier.clickable {
                    viewModel.currentUrl = photo.toEntity("b").url
                    navHostController.navigate(ClassesMain.CurrentPhotoScreen.route)
                },
                model = photo.toEntity("q").url,
                contentDescription = "Example Image",
                placeholder = painterResource(id = R.drawable.back), // Replace with your placeholder drawable
                error = painterResource(id = R.drawable.ic_launcher_foreground)// Replace with your error drawable
            )

            Log.i("fawfawf", photo.toEntity("q").url)

        }
    }
}