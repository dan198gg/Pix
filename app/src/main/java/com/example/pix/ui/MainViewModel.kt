package com.example.pix.ui

import android.util.Log
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import com.example.pix.data.flickr.dto.PhotoDto
import com.example.pix.data.repos.PixRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(val pixRepository: PixRepository): ViewModel() {
    val snapshotStateList = SnapshotStateList<PhotoDto>()
    var currentUrl = ""
    suspend fun getPhotos(){
        for (el in  pixRepository.getListPictures()){
            snapshotStateList.add(el)
        }
    }

    init{
        CoroutineScope(Dispatchers.IO).launch {
            snapshotStateList.clear()
            getPhotos()
            Log.i("efesfes",snapshotStateList.toList().toString())
        }
    }
}