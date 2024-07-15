/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import beans.ClienteBean;
import beans.VentaBean;
import entidades.Cliente;
import entidades.Venta;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class VentaController {
    @EJB
    private VentaBean ventaBean;
    @EJB
    private ClienteBean clienteBean;

    private Venta venta = new Venta();
    private Long clienteId;

    public void save() {
        Cliente cliente = clienteBean.find(clienteId);
        venta.setCliente(cliente);
        ventaBean.create(venta);
        venta = new Venta(); // Reset the form
    }

    public List<Venta> getVentas() {
        return ventaBean.findAll();
    }

    // Getters y Setters
    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
}