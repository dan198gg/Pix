package com.example.pix.domain.reposimpl

import com.example.pix.data.flickr.FlickrRepository
import com.example.pix.data.flickr.dto.PhotoDto
import com.example.pix.data.flickr.dto.PhotosDto
import com.example.pix.data.repos.PixRepository

class PixRepositoryImpl(private val flickrRepository: FlickrRepository): PixRepository {
    override suspend fun getListPictures(): List<PhotoDto> {
        return flickrRepository.search()
    }
}