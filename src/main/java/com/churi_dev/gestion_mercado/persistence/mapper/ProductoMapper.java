package com.churi_dev.gestion_mercado.persistence.mapper;

import com.churi_dev.gestion_mercado.domain.ProductDTO;
import com.churi_dev.gestion_mercado.persistence.entity.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    public ProductDTO productoToProductDTO(Producto producto) {
        return new ProductDTO(producto.getIdProducto(), producto.getNombre(), producto.getCodigoBarra(), producto.getPrecioVenta(), producto.getCantidadStock(), producto.getEstado(), producto.getIdCategoria(), producto.getCategoria());
    }
}
