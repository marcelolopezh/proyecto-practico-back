package everis.proyecto.practico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import everis.proyecto.practico.models.Sede;
import everis.proyecto.practico.services.SedeService;

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
	
	
}
