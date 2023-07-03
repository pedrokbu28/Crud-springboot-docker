package github.com.pedrokbu28.model;
 

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table
public class ChavepixApplication{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Number telefone;
	private String email;
	private Number cpf;
	private String chaveAleatoria;

	/**
	 * @return Long return the id
	 */

	public Long getId() {
			return id;
	}

	public Number getTelefone() {
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
	
	public void setTelefone(Number telefone) {
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

	public Object thenReturn(List<ChavepixApplication> of) {
		return null;
	}

}
