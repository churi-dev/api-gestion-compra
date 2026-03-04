package com.churi_dev.gestion_mercado.domain.repository;

import com.churi_dev.gestion_mercado.domain.CompraDTO;

import java.util.List;
import java.util.Optional;

public interface CompraRepository {
    List<CompraDTO> listarCompras();
    Optional<List<CompraDTO>> listarComprasPorCliente(Integer idCliente);
    CompraDTO save(CompraDTO compra);
}
