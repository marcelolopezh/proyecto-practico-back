package everis.proyecto.practico.repositories;

import java.util.Optional;

import everis.proyecto.practico.models.Login;
import everis.proyecto.practico.models.Usuario;



public interface RegistroRepository {
public Usuario newReg(Usuario usuarioAdministrador);
	
	public Optional<Usuario> findById(Integer id);
	
	public Usuario logIn(Login login);
}
