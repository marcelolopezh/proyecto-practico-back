package everis.proyecto.practico.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="logins")
public class Login { 
	
	@Id
	@GeneratedValue 
	private Long id;
	private String correo;
	private String contrasena; 
	
	@OneToOne(mappedBy = "login", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Usuario usuario;
	
	public Login(Long id, String correo, String contrasena) {
		super();
		this.id = id;
		this.correo = correo;
		this.contrasena = contrasena;
		
	}
	public Login() {
		super();
	}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}



