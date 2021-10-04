package everis.proyecto.practico.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sedes")
public class Sede {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String direccion;
	
	/* OTRA TABLA? */
	private String comuna;
	private String region;
	/* -------------------*/
	
	
	private Integer telefono;
	private String email;
	
	
	/* private String img */;
	
	
	
	
	
	public Sede() {
		super();
	}


	public Sede(Integer id, String nombre, String direccion, String comuna, String region, Integer telefono,
			String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.comuna = comuna;
		this.region = region;
		this.telefono = telefono;
		this.email = email;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getComuna() {
		return comuna;
	}


	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public Integer getTelefono() {
		return telefono;
	}


	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}
