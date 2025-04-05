package com.example.pix.data.repos

import com.example.pix.data.flickr.dto.PhotoDto

interface PixRepository {
    suspend fun getListPictures():  List<PhotoDto>

}