package com.nombre.appapirest.data.model

import com.nombre.appapirest.data.model.Post
import com.nombre.appapirest.data.remote.RetrofitInstance

// Este repositorio se encarga de acceder a los datos usando Retrofit
class PostRepository {

    // Función que obtiene los posts desde la API
    suspend fun getProductos(): List<Producto> {
        return RetrofitInstance.api.getProductos()
    }
}