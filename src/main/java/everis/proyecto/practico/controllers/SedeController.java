package everis.proyecto.practico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import everis.proyecto.practico.models.Sede;
import everis.proyecto.practico.services.SedeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SedeController {
	@Autowired
	SedeService sedeServ;
	/**@RequestMapping("/test")
	public String test() {
		return "test";
	}*/
	
	@RequestMapping("/getSedes")
	public List<Sede> getSedes(){
		return sedeServ.getSedes();
	}
	
	@PostMapping("/agregarSede")
	public Sede agregarSede(@RequestBody Sede sede) {
		// DEVOLVER OBJETO CREADO
		Sede newSede = sedeServ.save(sede);
		return newSede;
	}
	
	
}
