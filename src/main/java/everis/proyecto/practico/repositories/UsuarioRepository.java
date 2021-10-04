package everis.proyecto.practico.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import everis.proyecto.practico.models.Usuario;



public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
	
	List<Usuario> findAll();
	
}

