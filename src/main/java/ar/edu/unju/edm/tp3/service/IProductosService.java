package ar.edu.unju.edm.tp3.service;

import ar.edu.unju.edm.tp3.model.Producto;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Collection;
import java.util.List;

@Service
public interface IProductosService {
    void crearProducto(Producto producto);

    Optional<Producto> recuperarProducto(int codigo);

    void eliminarProducto(int codigo);

    void vaciarProductos();

    List<Producto> listarProductos();
}
