package com.churi_dev.gestion_mercado.persistence.mapper;

import com.churi_dev.gestion_mercado.domain.CompraDTO;
import com.churi_dev.gestion_mercado.domain.CompraItem;
import com.churi_dev.gestion_mercado.persistence.entity.Compra;
import com.churi_dev.gestion_mercado.persistence.entity.ComprasDetalle;
import com.churi_dev.gestion_mercado.persistence.entity.ComprasDetallePK;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class CompraMapper {

    public CompraDTO CompraToDTO(Compra compra) {

        CompraDTO compraDTO = new CompraDTO();
        compraDTO.setIdCompra(compra.getIdCompra());
        compraDTO.setFecha(compra.getFecha());
        compraDTO.setMedioPago(compra.getMedioPago());
        compraDTO.setComentario(compra.getComentario());
        compraDTO.setEstado(compra.getEstado());
        compraDTO.setIdCliente(compra.getIdCliente());

        List<CompraItem> compraItems = new ArrayList<>();

        compra.getComprasDetalle().forEach(item -> {
            CompraItem compraItem = new CompraItem();
            compraItem.setIdProducto(item.getId().getIdProducto());
            compraItem.setCantidad(item.getCantidad());
            compraItem.setTotal(item.getTotal());
            compraItem.setEstado(item.getEstado());
            compraItems.add(compraItem);
        });

        compraDTO.setItems(compraItems);

        return compraDTO;
    }

    public Compra compraDTOToCompra(CompraDTO compraDTO) {
        Compra compra = new Compra();
        compra.setFecha(LocalDateTime.now());
        compra.setMedioPago(compraDTO.getMedioPago());
        compra.setComentario(compraDTO.getComentario());
        compra.setEstado(compraDTO.getEstado());
        compra.setIdCliente(compraDTO.getIdCliente());

        // para los items de compras detalles | listas
        List<ComprasDetalle> items = new ArrayList<>();

        compraDTO.getItems().forEach(
                item -> {
                    ComprasDetalle comprasDetalle = new ComprasDetalle();

                    // clave compuesta
                    ComprasDetallePK pk = new ComprasDetallePK();
                    pk.setIdProducto(item.getIdProducto());

                    comprasDetalle.setId(pk);
                    comprasDetalle.setCantidad(item.getCantidad());
                    comprasDetalle.setTotal(item.getTotal());
                    comprasDetalle.setEstado(item.getEstado());

                    // relacion inversa
                    comprasDetalle.setCompra(compra);
                    items.add(comprasDetalle);
                }
        );

        compra.setComprasDetalle(items);

        return compra;
    }

    public List<CompraDTO> listComprasToDTO(List<Compra> compras) {
        List<CompraDTO> comprasDTO = new ArrayList<>();
        compras.forEach(compra -> comprasDTO.add(CompraToDTO(compra)));
        return comprasDTO;
    }
}
