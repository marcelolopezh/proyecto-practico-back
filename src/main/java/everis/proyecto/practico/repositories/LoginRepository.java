package everis.proyecto.practico.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import everis.proyecto.practico.models.Login;





@Repository
public interface LoginRepository extends CrudRepository <Login,Long> {
	Login findByCorreo(String correo);

}
