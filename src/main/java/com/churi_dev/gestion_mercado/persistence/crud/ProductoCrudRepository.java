package com.churi_dev.gestion_mercado.persistence.crud;

import com.churi_dev.gestion_mercado.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoCrudRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(Integer idCategoria);
}
