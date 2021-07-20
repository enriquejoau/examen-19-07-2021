/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex3lpjosias.Model;

/**
 *
 * @author Nick Meza
 */
public class Producto {
    private int producto_id;
    private String nombre;
    private int stock;
    private int Precio;
    private int categoria_id;

    public Producto() {
    }

    public Producto(int producto_id, String nombre, int stock, int Precio, int categoria_id) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.stock = stock;
        this.Precio = Precio;
        this.categoria_id = categoria_id;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }
    
}
