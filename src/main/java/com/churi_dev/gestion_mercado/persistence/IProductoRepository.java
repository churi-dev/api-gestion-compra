package com.churi_dev.gestion_mercado.persistence;

import com.churi_dev.gestion_mercado.domain.ProductDTO;
import com.churi_dev.gestion_mercado.domain.repository.ProductoRepository;
import com.churi_dev.gestion_mercado.persistence.crud.ProductoCrudRepository;
import com.churi_dev.gestion_mercado.persistence.mapper.ProductoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class IProductoRepository implements ProductoRepository {

    private final ProductoCrudRepository productoCrudRepository;

    private final ProductoMapper productoMapper;

    public IProductoRepository(ProductoCrudRepository productoCrudRepository, ProductoMapper productoMapper) {
        this.productoCrudRepository = productoCrudRepository;
        this.productoMapper = productoMapper;
    }

    @Override
    public List<ProductDTO> listarProductos() {
        return productoCrudRepository.findAll().stream().map(productoMapper::productoToProductDTO).collect(Collectors.toList());
    }
}
