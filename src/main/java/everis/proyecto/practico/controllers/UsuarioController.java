package everis.proyecto.practico.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import everis.proyecto.practico.models.Login;
import everis.proyecto.practico.models.Sede;
import everis.proyecto.practico.models.Usuario;
import everis.proyecto.practico.repositories.RegistroRepository;
import everis.proyecto.practico.services.UsuarioService;


@CrossOrigin (origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioServ;
	
	//private RegistroRepository regForm;

	/*
	@PostMapping("/administrador")
	public Usuario userRest(@RequestBody Usuario usuarioAdministrador) {
		usuarioAdministrador = regForm.newReg(usuarioAdministrador);
		return usuarioAdministrador;
	}

	@GetMapping("/administrador/{Id}")
	public Optional<Usuario> getUser(@PathVariable Integer Id) throws Exception {
		Optional<Usuario> elAdministrador = regForm.findById(Id);
		if (elAdministrador == null) {
			throw new Exception("Customer id not found - " + Id);
		}

		return elAdministrador;
	}

	@PostMapping("/login")
	public Usuario login(@Valid @RequestBody Login login) throws Exception {
		Usuario usuarioAdministrador = regForm.logIn(login);
		return usuarioAdministrador;
	}
	*/
	
	@RequestMapping("/getSedes")
	public List<Usuario> getUsuarios(){
		return usuarioServ.getUsuarios();
	}
	

}