package github.com.pedrokbu28.model;
 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChavepixApplication{
	
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

	/**
	 * @param id
	 */
	public void setId(Long id) {
	
	}
	public String setTelefone() {
			return telefone;
	}

	public String setEmail() {
			return email;
	}

	public Number setCpf() {
			return cpf;
	}

	public String setChaveAleatoria() {
			return chaveAleatoria;
	}
}



	