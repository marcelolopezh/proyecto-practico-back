package everis.proyecto.practico.controllers;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import everis.proyecto.practico.models.Login;
import everis.proyecto.practico.services.LoginService;

@RestController
public class LoginController { 
	
	@Autowired
	LoginService loginService; 
	
	@RequestMapping("/login")
	public String login() {
		
		return null;
	}

	@PostMapping("/ingresar") 
	public Login ingresar(@RequestParam("correo") String correo,
			@RequestParam ("contrasena") String contrasena) {
		boolean isLogin=loginService.validarLogin(correo,contrasena);
		if(isLogin) { 
			Login login =  loginService.findbyEmail(correo);
			return login; 
		}
		return null;
	}
	
	@PostMapping("/a")
	public void a(@RequestParam("contrasena") String contrasena) {
		System.out.println(BCrypt.hashpw(contrasena, BCrypt.gensalt()));
	}
	
	
}
