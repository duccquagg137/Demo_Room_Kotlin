package com.example.demo_room_kotlin

class ImageRepository(private val imageDao: ImageDao) {

    suspend fun insert(image: Image) {
        imageDao.insert(image)
    }

    suspend fun getAllImages(): List<Image> {
        return imageDao.getAllImages()
    }
}
