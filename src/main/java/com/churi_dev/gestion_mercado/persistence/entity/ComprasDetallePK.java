package com.churi_dev.gestion_mercado.persistence.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ComprasDetallePK implements Serializable {

    private Integer idProducto;
    private Integer idCompra;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }
}
