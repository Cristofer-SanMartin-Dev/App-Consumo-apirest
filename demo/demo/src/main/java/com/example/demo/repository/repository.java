package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.producto;


// La interfaz extiende JpaRepository, que ya incluye el método findAll()
// <Tipo de Entidad, Tipo de la Clave Primaria>
@Repository
public interface repository extends JpaRepository<producto, Integer> { 
    // No necesitas escribir el método 'findAll()' (SELECT * FROM producto).
    // Spring Data JPA lo genera automáticamente.
    
    // Si quisieras un método específico, lo definirías aquí, por ejemplo:
    // List<producto> findByStockGreaterThan(int stock);
}