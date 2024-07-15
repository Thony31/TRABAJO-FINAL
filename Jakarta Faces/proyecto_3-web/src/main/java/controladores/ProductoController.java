/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import beans.ProductoBean;
import entidades.Producto;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ProductoController {
    @EJB
    private ProductoBean productoBean;

    private Producto producto = new Producto();

    public void save() {
        productoBean.create(producto);
        producto = new Producto(); // Reset the form
    }

    public List<Producto> getProductos() {
        return productoBean.findAll();
    }

    // Getters y Setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
