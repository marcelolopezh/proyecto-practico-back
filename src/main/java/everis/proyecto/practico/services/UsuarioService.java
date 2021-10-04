package everis.proyecto.practico.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import everis.proyecto.practico.models.Usuario;
import everis.proyecto.practico.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRep;
	
	public List<Usuario> getUsuarios() {
		return usuarioRep.findAll();
	}
}
