package everis.proyecto.practico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import everis.proyecto.practico.models.Sede;
import everis.proyecto.practico.repositories.SedeRepository;

@Service
public class SedeService {
	@Autowired 
	SedeRepository sedeRep;
	
	public List<Sede> getSedes() {
		return sedeRep.findAll();
	}
}
