package com.example.demo_room_kotlin

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ImageViewModel(private val repository: ImageRepository) : ViewModel() {

    var images by mutableStateOf<List<Image>>(emptyList())
        private set

    fun insertImage(uri: String) {
        viewModelScope.launch {
            repository.insert(Image(uri = uri))
            images = repository.getAllImages()
        }
    }

    fun loadImages() {
        viewModelScope.launch {
            images = repository.getAllImages()
        }
    }
}
