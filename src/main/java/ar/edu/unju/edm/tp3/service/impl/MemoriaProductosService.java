package ar.edu.unju.edm.tp3.service.impl;

import ar.edu.unju.edm.tp3.model.Producto;
import ar.edu.unju.edm.tp3.service.IProductosService;
import ar.edu.unju.edm.tp3.util.Productos;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MemoriaProductosService implements IProductosService {

    @Override
    public void crearProducto(Producto producto) {
        Productos.getProductos().put(producto.getCodigo(), producto);
    }

    @Override
    public Producto recuperarProducto(int codigo) {
        return Productos.getProductos().get(codigo);
    }

    @Override
    public Producto eliminarProducto(int codigo) {
        return Productos.getProductos().remove(codigo);
    }

    @Override
    public void vaciarProductos() {
        Productos.getProductos().clear();
    }

    @Override
    public Collection<Producto> listarProductos() {
        return Productos.getProductos().values();
    }
}
