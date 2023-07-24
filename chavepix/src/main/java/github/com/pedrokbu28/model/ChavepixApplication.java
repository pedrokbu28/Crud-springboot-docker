package github.com.pedrokbu28.model;

import jakarta.persistence.*;

import java.io.Serializable;



@Entity
@Table(name = "tb_chavepix")
public class ChavepixApplication  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String telefone;
	private String email;
	private String cpf;

	@Column(name = "chave_aleatoria")
	private String chaveAleatoria;

	public ChavepixApplication() {
	}

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

	public String getCpf() {
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

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setChaveAleatoria(String chaveAleatoria) {
		this.chaveAleatoria = chaveAleatoria;
	}

}


