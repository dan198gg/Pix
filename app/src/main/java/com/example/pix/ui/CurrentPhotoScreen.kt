package com.example.pix.ui


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import coil3.compose.AsyncImage
import com.example.pix.R
import me.saket.telephoto.zoomable.rememberZoomableState
import me.saket.telephoto.zoomable.zoomable

@Composable
fun CurrentPhotoScreen(viewModel: MainViewModel) {
        Box(Modifier.fillMaxSize()) {
        AsyncImage(
            model = viewModel.currentUrl,
            contentDescription = "",
            placeholder = painterResource(id = R.drawable.back),
            error = painterResource(id = R.drawable.ic_launcher_foreground),
            modifier = Modifier.align(Alignment.Center).fillMaxSize().zoomable(rememberZoomableState())
        )
    }
}