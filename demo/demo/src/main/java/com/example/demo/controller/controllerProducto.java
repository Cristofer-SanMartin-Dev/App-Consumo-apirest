package com.example.demo.controller;

import com.example.demo.model.producto;
import com.example.demo.repository.repository; // Usamos el repositorio que creamos
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api") // URL base para todos los endpoints de productos
public class controllerProducto {

    @Autowired
    private repository productoRepository; // Inyección de dependencia del repositorio

    // Endpoint: GET -
    @GetMapping("/buscarTodos")
    public List<producto> getAllProductos() {
        // Llama al método findAll() de JpaRepository
        return productoRepository.findAll();
    }
}