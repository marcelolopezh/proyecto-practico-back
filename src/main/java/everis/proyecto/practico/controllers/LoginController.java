package everis.proyecto.practico.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping("/ingresar") 
	public String ingresar(@RequestParam("correo") String correo,
			@RequestParam ("contrasena") String contrasena, 
			HttpSession session) {
		boolean isLogin=loginService.validarLogin(correo,contrasena);
		if(isLogin) { 
			Login login =  loginService.findbyEmail(correo);
			session.setAttribute("userId", login.getId());
			return "home";
			//return login; 
		}
		return "login";
		
	}
	
}
