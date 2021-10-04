package everis.proyecto.practico.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import everis.proyecto.practico.models.Sede;

@Repository
public interface SedeRepository extends CrudRepository<Sede,Long>{
	List<Sede> findAll();
}
