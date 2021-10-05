package everis.proyecto.practico.controllers;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import everis.proyecto.practico.models.Login;
import everis.proyecto.practico.services.LoginService;

public class LoginController { 
	
	@Autowired
	LoginService loginService; 
	
	@RequestMapping("/login")
	public String login() {
		
		return null;
	}

	@RequestMapping("/ingresar") 
	public Login ingresar(@RequestParam("correo") String correo,
			@RequestParam ("contrasena") String contrasena, 
			HttpSession session) {
		boolean isLogin=loginService.validarLogin(correo,contrasena);
		if(isLogin) { 
			return loginService.findbyEmail(correo);
			return login; 

		}
		
	}
	
}
