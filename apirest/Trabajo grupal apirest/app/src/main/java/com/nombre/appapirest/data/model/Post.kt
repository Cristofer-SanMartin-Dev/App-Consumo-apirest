package com.nombre.appapirest.data.model

import android.R
import com.google.gson.annotations.SerializedName

// Esta clase representa un post obtenido desde la API
data class Post(
    val nombre: String, // ID del usuario que creó el post
    val id: Int, // ID del post
    val descipcion: String, // Título del post
    val body: String // Cuerpo o contenido del post
)
data class Producto(
    @SerializedName("idProducto")
    val idProducto: Int,

    val nombre: String,
    val valor: Int,
    val stock: Int,

    @SerializedName("descripcion")
    val descripcion: String

)