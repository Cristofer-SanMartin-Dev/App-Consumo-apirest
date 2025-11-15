package com.nombre.appapirest.viewmodel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nombre.appapirest.data.model.Post
import com.nombre.appapirest.data.model.PostRepository
import com.nombre.appapirest.data.model.Producto
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// ViewModel que mantiene el estado de los datos obtenidos
class PostViewModel : ViewModel() {

    private val repository = PostRepository()
    // Flujo mutable que contiene la lista de posts
    private val _postList = MutableStateFlow<List<Producto>>(value = emptyList())
    // Flujo público de solo lectura
    val postList: StateFlow<List<Producto>> = _postList

    // Se llama automáticamente al iniciar
    init {
        fetchPosts()
    }

    // Función que obtiene los datos en segundo plano
    private fun fetchPosts() {
        viewModelScope.launch {
            try {
                _postList.value = repository.getProductos()
            } catch (e: Exception) {
                println("Error al obtener datos: ${e.localizedMessage}")
            }
        }
    }
}