package com.churi_dev.gestion_mercado.domain.service;

import com.churi_dev.gestion_mercado.domain.ProductDTO;
import com.churi_dev.gestion_mercado.persistence.IProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final IProductoRepository productoRepository;

    public ProductoService(IProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<ProductDTO> getAll() {
        return productoRepository.listarProductos();
    }



}
