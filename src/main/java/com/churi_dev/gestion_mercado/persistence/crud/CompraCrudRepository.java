package com.churi_dev.gestion_mercado.persistence.crud;

import com.churi_dev.gestion_mercado.persistence.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompraCrudRepository extends JpaRepository<Compra, Integer> {
    Optional<List<Compra>> findByIdCliente(Integer idCliente);
}
