package com.eureka.cloud.course.item.models;

public class Item {
    private Producto producto;
    private Integer cantidad;

    public Item() {}

    public Item(Integer cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return this.producto.getPrecio() * cantidad.doubleValue();
    }
}
