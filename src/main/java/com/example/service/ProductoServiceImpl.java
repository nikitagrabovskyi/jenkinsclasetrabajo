package com.example.service;




import com.example.model.Producto;
import com.example.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repository;

    public ProductoServiceImpl(ProductoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Producto> getProductoById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Producto> getAllProductos() {
        return repository.findAll();
    }
}

