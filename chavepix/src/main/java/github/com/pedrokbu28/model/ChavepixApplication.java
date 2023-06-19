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
}



	