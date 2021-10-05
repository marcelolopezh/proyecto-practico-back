package everis.proyecto.practico.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@GetMapping("/sede/{id}")
	public Optional<Sede> obtenerSede(@PathVariable("id") Long id) {
		return sedeServ.findById(id);
	}
	
	//METODO ACTUALIZAR
	@RequestMapping(value="/actualizar/{id}", method = RequestMethod.GET)
	public String actualizar(@PathVariable("id") Long id, Model model) {
		System.out.println("Actualizar Sede id: "+ id);
		Sede sede = sedeServ.buscarSede(id);
		model.addAttribute("Sede", sede);
		return "editar_sede.jsp";
	}
}
