package com.example.demo_room_kotlin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ImageDao {
    @Insert
    suspend fun insert(image: Image)

    @Query("SELECT * FROM images")
    suspend fun getAllImages(): List<Image>
}
