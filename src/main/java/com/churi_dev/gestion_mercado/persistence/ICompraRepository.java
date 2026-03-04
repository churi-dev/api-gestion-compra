package com.churi_dev.gestion_mercado.persistence;

import com.churi_dev.gestion_mercado.domain.CompraDTO;
import com.churi_dev.gestion_mercado.domain.repository.CompraRepository;
import com.churi_dev.gestion_mercado.persistence.crud.CompraCrudRepository;
import com.churi_dev.gestion_mercado.persistence.entity.Compra;
import com.churi_dev.gestion_mercado.persistence.mapper.CompraMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ICompraRepository implements CompraRepository {

    private final CompraCrudRepository compraCrudRepository;
    private final CompraMapper compraMapper;

    public ICompraRepository(CompraCrudRepository compraCrudRepository,
                             CompraMapper compraMapper) {
        this.compraCrudRepository = compraCrudRepository;
        this.compraMapper = compraMapper;
    }

    public List<CompraDTO> listarCompras() {
        return compraCrudRepository.findAll().stream().map(compraMapper::CompraToDTO).collect(Collectors.toList());
    }

    public Optional<List<CompraDTO>> listarComprasPorCliente(Integer idCliente) {
        return compraCrudRepository.findByIdCliente(idCliente).map(compraMapper::listComprasToDTO);
    }

    public CompraDTO save(CompraDTO compraDTO) {
        Compra compra = compraMapper.compraDTOToCompra(compraDTO);
        compra.getComprasDetalle().forEach(producto -> producto.setCompra(compra));
        return compraMapper.CompraToDTO(compraCrudRepository.save(compra));
    }
}
