package com.example.productos;

import com.example.model.Producto;
import com.example.repository.ProductoRepository;
import com.example.service.ProductoServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductoServiceTest {

    @Mock
    private ProductoRepository repository;

    @InjectMocks
    private ProductoServiceImpl service;

    @Test
    void getProductoByIdTest() {
        Producto producto = new Producto(1L, "Teclado", 20.0);

        Mockito.when(repository.findById(1L))
                .thenReturn(Optional.of(producto));

        Optional<Producto> resultado = service.getProductoById(1L);

        assertTrue(resultado.isPresent());
        assertEquals("Teclado", resultado.get().getNombre());

        Mockito.verify(repository, Mockito.times(1)).findById(1L);
    }
}
