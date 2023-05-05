package ar.edu.unju.edm.tp3.service;

import ar.edu.unju.edm.tp3.model.Producto;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface IProductosService {
    void crearProducto(Producto producto);

    Producto recuperarProducto(int codigo);

    Producto eliminarProducto(int codigo);

    void vaciarProductos();

    Collection<Producto> listarProductos();
}
