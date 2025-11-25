package com.churi_dev.gestion_mercado.domain;

import com.churi_dev.gestion_mercado.persistence.entity.Categoria;

public class ProductDTO {
    private Integer idProducto;
    private String nombre;
    private String codigoBarra;
    private Double precioVenta;
    private int cantidadStock;
    private Boolean estado;
    private Integer idCategoria;
    private Categoria categoria;

    public ProductDTO(Integer idProducto, String nombre, String codigoBarra, Double PrecioVenta, int cantidadStock, Boolean estado, Integer idCategoria , Categoria categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.codigoBarra = codigoBarra;
        this.precioVenta = PrecioVenta;
        this.cantidadStock = cantidadStock;
        this.idCategoria = idCategoria;
        this.estado = estado;
        this.categoria = categoria;
    }


    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
