package com.churi_dev.gestion_mercado.web;

import com.churi_dev.gestion_mercado.domain.ProductDTO;
import com.churi_dev.gestion_mercado.domain.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/")
    public ResponseEntity<List<ProductDTO>> getAll() {
        return new ResponseEntity<>(productoService.getAll(), HttpStatus.OK);
    }

}
