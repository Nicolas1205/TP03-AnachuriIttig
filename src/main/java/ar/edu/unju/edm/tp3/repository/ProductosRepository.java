package ar.edu.unju.edm.tp3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.tp3.model.Producto;

import java.util.Collection;

@Repository
public interface ProductosRepository extends CrudRepository<Producto, Integer> {
		@Query("SELECT p FROM Producto where p.estado = 1")
		Collection<Producto> findAll();
		@Query("UPDATE Producto SET estado = 0 WHERE codigo = :codigo")
		void eliminarProducto(int codigo);
}
