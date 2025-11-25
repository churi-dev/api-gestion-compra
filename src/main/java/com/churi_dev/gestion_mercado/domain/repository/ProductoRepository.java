package com.churi_dev.gestion_mercado.domain.repository;

import com.churi_dev.gestion_mercado.domain.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
    List<ProductDTO> listarProductos();

    List<ProductDTO> otenerPorCategoria(Integer idCategoria);

    // optional => si no encuentra un valor devuelve vacio
    Optional<ProductDTO> obtenerProductoPorId(Integer id);

    ProductDTO guardarProducto(ProductDTO productDTO);

    void eliminarProducto(Integer productoId);
}
