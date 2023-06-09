package ar.edu.unju.edm.tp3.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.tp3.model.Producto;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProductosRepository extends ListCrudRepository<Producto, Integer> {
		@Query(
					 value="SELECT * FROM producto where estado = 1",
					 nativeQuery = true)
		public List<Producto> findAllActive();
		@Query(
					 value="UPDATE producto SET estado = 0 WHERE codigo = :codigo",
					 nativeQuery = true)
		public void deleteById(int codigo);
}
