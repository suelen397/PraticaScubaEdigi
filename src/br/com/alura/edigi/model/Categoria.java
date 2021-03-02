package br.com.alura.edigi.model;

import java.time.LocalDate;

public class Categoria {
	
	
		
		private String nome;
		private LocalDate data;
		

		public  Categoria(String nome) {
			setNome(nome);
			this.data = LocalDate.now();
		}
		
		private void setNome(String nome) {
			if(nome == null || nome.isBlank()) {
				throw new IllegalArgumentException("É OBRIGATÓRIO apresentar o nome da categoria!!! ");
			}	
			this.nome = nome;
		}
			

		public String getNome() {
			return nome;
		}
		
		public LocalDate getData() {
			return data;
		}

		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
			Categoria other = (Categoria) obj;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Categoria [nome=" + nome + ", data=" + data + "]";
		}
		
	}	




