package com.churi_dev.gestion_mercado.domain.repository;

import com.churi_dev.gestion_mercado.domain.ProductDTO;

import java.util.List;

public interface ProductoRepository {
    List<ProductDTO> listarProductos();
}
