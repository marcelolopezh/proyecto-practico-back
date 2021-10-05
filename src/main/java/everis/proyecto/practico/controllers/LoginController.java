package everis.proyecto.practico.controllers;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import everis.proyecto.practico.models.Login;
import everis.proyecto.practico.services.LoginService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class LoginController { 
	
	@Autowired
	LoginService loginService; 
	
	@RequestMapping("/login")
	public String login() {
		
		return null;
	}

	@PostMapping("/ingresar") 
	public Map<String, Login> ingresar(@RequestParam("correo") String correo,
			@RequestParam ("contrasena") String contrasena) {
		boolean isLogin=loginService.validarLogin(correo,contrasena);
		if(isLogin) { 
			Login login =  loginService.findbyEmail(correo);
			String token = getJWTToken(LocalDateTime.now().toString());
			Map<String, Login> data = new HashMap<>();
			data.put(token, login);
			return data; 
		}
		return null;
	}
	
	@PostMapping("/a")
	public void a(@RequestParam("contrasena") String contrasena) {
		System.out.println(BCrypt.hashpw(contrasena, BCrypt.gensalt()));
	}
	
	
	private String getJWTToken(String data) {
		String secretKey = "proyectoPractico";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

		String token = Jwts.builder().setId(UUID.randomUUID().toString()).setSubject(data)
				.claim("authorities",
						grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 20000)) // 12 horas 43200000
				.signWith(SignatureAlgorithm.HS512, secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
	
}
