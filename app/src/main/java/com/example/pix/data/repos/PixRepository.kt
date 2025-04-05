package com.example.pix.data.repos

import com.example.pix.data.flickr.dto.PhotoDto
import com.example.pix.data.flickr.dto.PhotosDto

interface PixRepository {
    suspend fun getListPictures():  List<PhotoDto>

}