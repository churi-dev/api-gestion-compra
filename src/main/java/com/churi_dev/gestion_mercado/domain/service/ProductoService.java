package com.churi_dev.gestion_mercado.domain.service;

import com.churi_dev.gestion_mercado.domain.ProductDTO;
import com.churi_dev.gestion_mercado.persistence.IProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final IProductoRepository productoRepository;

    public ProductoService(IProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<ProductDTO> getAll() {
        return productoRepository.listarProductos();
    }

    public List<ProductDTO> getByCategoria(Integer idCategoria) {
        return productoRepository.otenerPorCategoria(idCategoria);
    }

    public Optional<ProductDTO> getById(Integer id) {
        return productoRepository.obtenerProductoPorId(id);
    }

    public ProductDTO create(ProductDTO productDTO) {
        return productoRepository.guardarProducto(productDTO);
    }

    public boolean deleteProductById(Integer idProducto) {

        return getById(idProducto).map(product -> {
            productoRepository.eliminarProducto(idProducto);
            return true;
        }).orElse(false);
    }



}
