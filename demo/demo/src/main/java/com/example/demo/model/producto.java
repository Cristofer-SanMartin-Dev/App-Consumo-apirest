package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class producto {
    
     @Id // El RUT como clave primaria
    private int IdProducto;

    private String nombre;
    // Almacenará la contraseña en texto plano (sin encriptación)
    private int valor;
    private int stock;
     private String Descripcion;
}
