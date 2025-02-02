package com.webapp.springpresentacion.servicio;
import java.util.List;
import com.webapp.springpresentacion.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webapp.springpresentacion.entidades.Producto;



@Service
public class ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<Producto> listAll(String palabraClave) {
        if (palabraClave !=null){
            return productoRepositorio.findAll(palabraClave);
        }
        return productoRepositorio.findAll();
    }

    public void save(Producto producto) {
        productoRepositorio.save(producto);
    }

    public Producto get(Long id) {
        return productoRepositorio.findById(id).get();
    }

    public void delete(Long id) {
        productoRepositorio.deleteById(id);
    }
}
