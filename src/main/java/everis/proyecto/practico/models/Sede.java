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
	private Long id;
	private String nombre;
	private String direccion;
	
	/* OTRA TABLA? */
	private String comuna;
	private String region;
	/* -------------------*/
	
	
	private Integer telefono;
	private String correo;
	
	
	/* private String img */;
	private String img;
	
	
	
	
	public Sede() {
		super();
	}


	public Sede(Long id, String nombre, String direccion, String comuna, String region, Integer telefono,
			String correo, String img) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.comuna = comuna;
		this.region = region;
		this.telefono = telefono;
		this.correo = correo;
		this.img=img;
	}


	
	
	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	
	
}
