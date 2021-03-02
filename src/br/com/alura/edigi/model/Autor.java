package br.com.alura.edigi.model;

import java.time.LocalDate;



public class Autor {
	private String email;
	private String nome;
	private String biografia;
	private LocalDate data;

	public Autor(String email, String nome, String biografia) {
		if (!(email.matches("^([\\w-]\\.?)+@([\\w-]+\\.)+([A-Za-z]{2,4})+$"))) {
			throw new IllegalArgumentException("O email informado não é válido..");
		}
		this.email = email;

		
		if (nome.isBlank()) {
			throw new IllegalArgumentException("O nome não pode ser vazio!!!");
		}
		this.nome = nome;
		
		
		if (biografia.isBlank()) {
			throw new IllegalArgumentException("É necessário informar a biografia do autor.");
		}
		this.biografia = biografia;
		
		
		this.data = LocalDate.now();
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {

		this.email = email; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank()) {
			throw new IllegalArgumentException("O nome não pode ser vazio!!!");
		}
		this.nome = nome;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public LocalDate getData() {
		return data;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Autor [email=" + email + ", nome=" + nome + ", biografia=" + biografia + "]";
	}

	}

