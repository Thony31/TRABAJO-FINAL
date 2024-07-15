/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package beans;

import entidades.Cliente;
import entidades.Venta;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class VentaBean {
    @PersistenceContext
    private EntityManager em;

    public void create(Venta venta) {
        em.persist(venta);
    }

    public List<Venta> findAll() {
        return em.createQuery("SELECT v FROM Venta v", Venta.class).getResultList();
    }

    public Cliente findCliente(Long id) {
        return em.find(Cliente.class, id);
    }
}
