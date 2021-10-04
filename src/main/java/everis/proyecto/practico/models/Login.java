package everis.proyecto.practico.models;

import javax.validation.constraints.NotBlank;


public class Login { 
	
	@NotBlank
	private String emailId;
	
	@NotBlank
	private String password;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}



