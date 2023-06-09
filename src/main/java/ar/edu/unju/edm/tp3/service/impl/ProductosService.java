package ar.edu.unju.edm.tp3.service.impl;

import ar.edu.unju.edm.tp3.model.Producto;
import ar.edu.unju.edm.tp3.service.IProductosService;
import ar.edu.unju.edm.tp3.repository.ProductosRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Optional;
import java.util.List;

@Service
public class ProductosService implements IProductosService {

		@Autowired
		ProductosRepository productosRepository;	

    @Override
    public void crearProducto(Producto producto) {
				productosRepository.save(producto);
    }

    @Override
    public Optional<Producto> recuperarProducto(int codigo) {
				return productosRepository.findById(codigo);
    }

    @Override
    public void eliminarProducto(int codigo) {
				productosRepository.deleteById(codigo);
    }

    @Override
    public void vaciarProductos() {
				productosRepository.deleteAll();
    }

    @Override
    public List<Producto> listarProductos() {
				return productosRepository.findAllActive();
    }
}
