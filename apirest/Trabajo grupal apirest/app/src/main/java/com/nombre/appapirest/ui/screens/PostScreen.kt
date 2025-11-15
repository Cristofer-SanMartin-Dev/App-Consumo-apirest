package com.nombre.appapirest.ui.screens

// --- PRIMERA PARTE DE LA IMAGEN ---

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nombre.appapirest.viewmodel.PostViewModel // <-- REEMPLAZO APLICADO
import android.util.Log
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostScreen(viewModel: PostViewModel) {
    // Observamos el flujo de datos del ViewModel
    val posts = viewModel.postList.collectAsState().value

    // Scaffold con TopAppBar
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Listado de Productos") }
            )
        }
    ) { innerPadding ->
        // Aplicamos el padding de seguridad del sistema

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues = innerPadding)) { // Esto garantiza el uso de edge-to-edge
            // Lista de publicaciones
            LazyColumn(

                modifier = Modifier
                    .fillMaxSize()
                    .padding(all = 16.dp) // Espaciado interior del contenido
            ) {

                items(items = posts) { post ->

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {

                        Column(modifier = Modifier.padding(all = 16.dp)) {

                            Text(

                                text = "Nombre: ${post.nombre}",
                                style = MaterialTheme.typography.titleMedium

                            )
                            Spacer(modifier = Modifier.height(height = 4.dp))

                            Text(

                                text = "Descripcion: ${post.descripcion}",
                                style = MaterialTheme.typography.titleMedium

                            )
                            Spacer(modifier = Modifier.height(height = 4.dp))

                            Text(
                                text = "Precio: ${post.valor}",
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Spacer(modifier = Modifier.height(height = 4.dp))

                            Text(

                                text = "Stock en Linea: ${post.stock}",
                                style = MaterialTheme.typography.titleMedium

                            )
                            Spacer(modifier = Modifier.height(height = 4.dp))

                        }
                    }
                }
            }
        }
    }
}

