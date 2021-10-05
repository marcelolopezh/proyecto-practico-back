package everis.proyecto.practico.services;

import java.util.Optional;

import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import everis.proyecto.practico.models.Login;
import everis.proyecto.practico.repositories.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public void save(@Valid Login login) {

		String hashed = BCrypt.hashpw(login.getContrasena(), BCrypt.gensalt());
		login.setContrasena(hashed);
		loginRepository.save(login);

	}

	public boolean validarLogin(String correo, String contrasena) {

		Login login = loginRepository.findByEmail(correo).get();
		if (login == null) {
			return false;
		} else {
			if (BCrypt.checkpw(contrasena, login.getContrasena())) {
				System.out.println("Contraseñas iguales");
				return true;
			} else {
				System.out.println("Contraseñas distintas");
				return false;
			}
		}
	}

	public Optional<Login> findbyEmail(String correo) {
		return loginRepository.findByEmail(correo);
	}
}
