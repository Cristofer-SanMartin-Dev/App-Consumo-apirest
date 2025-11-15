package com.nombre.appapirest.data.remote

import com.nombre.appapirest.data.model.Post
import com.nombre.appapirest.data.model.Producto
import retrofit2.http.GET

// Esta interfaz define los endpoints HTTP
interface ApiService {

    // Define una solicitud GET al endpoint /posts
    @GET("api/buscarTodos") // ✅ Correcto para Android Emulator
    suspend fun getProductos(): List<Producto>
}