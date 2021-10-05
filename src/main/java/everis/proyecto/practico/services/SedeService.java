package everis.proyecto.practico.services;

import java.util.List;
import java.util.Optional;

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

	public Sede save(Sede sede) {
		return sedeRep.save(sede);
	}

	public Optional<Sede> findById(Long id) {
		return sedeRep.findById(id);
	}

	public Sede buscarSede(Long id) {
		Optional<Sede> sede = sedeRep.findById(id);
		
		if(sede.isPresent()) {
			return sede.get();
		}
		return null;
	}
}
