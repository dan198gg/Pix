package com.example.pix.data.flickr

import com.example.pix.data.flickr.dto.FlickrResult
import com.example.pix.data.flickr.dto.PhotoDto
import com.example.pix.domain.entity.Picture
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FlickrRepository(
    private val flickrApi: FlickrApi,
    // TODO
) {
    suspend fun search(
        text: String = "cats",
        page: Int = 1,
        count: Int = 100
    ): List<PhotoDto> = withContext(Dispatchers.IO){
        val result = flickrApi.search(text, page, count)
        return@withContext result.photos!!.photo
    }
}