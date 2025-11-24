package com.churi_dev.gestion_mercado.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "compras_detalles")
public class ComprasDetalle {

    @EmbeddedId
    private ComprasDetallePK id;

    private int cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @MapsId("idCompra")
    @JoinColumn(name = "id_compra")
    private Compra compra;

    public ComprasDetallePK getId() {
        return id;
    }

    public void setId(ComprasDetallePK id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
