package com.example.service;





import com.example.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    Optional<Producto> getProductoById(Long id);
    List<Producto> getAllProductos();
}
