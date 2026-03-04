package com.churi_dev.gestion_mercado.web.controller;

import com.churi_dev.gestion_mercado.domain.CompraDTO;
import com.churi_dev.gestion_mercado.domain.service.CompraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    private final CompraService compraService;

    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CompraDTO>> getAll() {
        return new ResponseEntity<>(compraService.getAllCompras(), HttpStatus.OK);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<CompraDTO>> getByCliente(@PathVariable Integer id) {
        return compraService.getByClienteId(id).map(
                compras -> new ResponseEntity<>(compras, HttpStatus.OK)
        ).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<CompraDTO> saveCompra(@RequestBody CompraDTO compraDTO) {
        return new ResponseEntity<>(compraService.save(compraDTO), HttpStatus.CREATED);
    }

}
