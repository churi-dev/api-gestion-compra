package com.churi_dev.gestion_mercado.domain.service;

import com.churi_dev.gestion_mercado.domain.CompraDTO;
import com.churi_dev.gestion_mercado.persistence.ICompraRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {
    private final ICompraRepository iCompraRepository;

    public CompraService(ICompraRepository iCompraRepository) {
        this.iCompraRepository = iCompraRepository;
    }

    public List<CompraDTO> getAllCompras() {
        return iCompraRepository.listarCompras();
    }

    public Optional<List<CompraDTO>> getByClienteId(Integer idCliente) {
        return iCompraRepository.listarComprasPorCliente(idCliente);
    }

    public CompraDTO save(CompraDTO compraDTO) {
        return iCompraRepository.save(compraDTO);
    }
}
