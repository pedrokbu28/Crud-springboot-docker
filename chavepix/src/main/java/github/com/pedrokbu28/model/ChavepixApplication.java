package github.com.pedrokbu28.model;
 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table(name = "tb_chavepix")
public class ChavepixApplication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String telefone;
	private String email;
	private Number cpf;
	private String chaveAleatoria;

	/**
	 * @return Long return the id
	 */

	public Long getId() {
			return id;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public Number getCpf() {
		return cpf;
	}

	public String getChaveAleatoria() {
		return chaveAleatoria;
	}

	/**
	 * @param 
	 */

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCpf(Number cpf) {
		this.cpf = cpf;
	}

	public void setChaveAleatoria(String chaveAleatoria) {
		this.chaveAleatoria = chaveAleatoria;
	}

}
