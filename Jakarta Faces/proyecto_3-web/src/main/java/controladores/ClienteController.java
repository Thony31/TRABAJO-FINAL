/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import beans.ClienteBean;
import entidades.Cliente;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ClienteController {
    @EJB
    private ClienteBean clienteBean;

    private Cliente cliente = new Cliente();

    public void save() {
        clienteBean.create(cliente);
        cliente = new Cliente(); // Reset the form
    }

    public List<Cliente> getClientes() {
        return clienteBean.findAll();
    }

    // Getters y Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
