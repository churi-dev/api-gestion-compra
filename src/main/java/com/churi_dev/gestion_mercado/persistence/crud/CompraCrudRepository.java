package com.churi_dev.gestion_mercado.persistence.crud;

import com.churi_dev.gestion_mercado.persistence.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraCrudRepository extends JpaRepository<Compra, Integer> {
}
