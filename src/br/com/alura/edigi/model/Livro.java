package br.com.alura.edigi.model;

public class Livro {

	private String titulo;
	private String isbn;
	private String resumo;
	private String sumario;
	private int numeroDepaginas;
	private double preco;
	private Autor autor;
	private Categoria categoria;

	public Livro(String titulo,  String isbn, String resumo, String sumario, int numeroDepaginas, double preco, Autor autor, Categoria categoria) {
		setTitulo(titulo);
		setIsbn(isbn);
		setResumo(resumo);
		setSumario(sumario);
		setNumeroDepaginas(numeroDepaginas);
		setPreco(preco);
		setAutor(autor);
		setCategoria(categoria);
	}

	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		if(titulo == null || titulo.isBlank()) {
			throw new IllegalArgumentException("O Título do Livro não pode ser nulo e nem Vazio!! ");
		}
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	private void setIsbn(String isbn) {
		if(isbn == null || isbn.isBlank()) {
			throw new IllegalArgumentException("O ISBN Não pode ser nulo ou vazio!!");
		}
		if(!isbn.matches("\\d{3}-\\d{2}-\\d{5}-\\d{2}-\\d{1}")) {
			throw new IllegalArgumentException("O ISBN não é válido!!");
		}
        if(!isbn.startsWith("978")) {
            throw new IllegalArgumentException("O inicio do ISBN tem que ser 978!!");
        }
		
		this.isbn = isbn;
	}

	public String getResumo() {
		return resumo;
	}


	private void setResumo(String resumo) {
		if(resumo == null || resumo.isBlank()) {
			throw new IllegalArgumentException("O resumo não pode ser nulo ou vazio!!");
		}
		if(resumo.length() >= 500) {
			throw new IllegalArgumentException("O resumo do livro Não pode ultrapassar 500 caractéres");
		}
		this.resumo = resumo;
	}

	public String getSumario() { 
		return sumario;
	}

	private void setSumario(String sumario) {
		if(sumario ==  null || sumario.isBlank()) {
			throw new IllegalArgumentException("O sumário do Livro não pode ser nulo ou vazio!!!");
		}
		this.sumario = sumario;
	}

	public int getNumeroDepaginas() {
		return numeroDepaginas;
	}

	private void setNumeroDepaginas(int numeroDepaginas) {
		if (numeroDepaginas <= 0) {
			throw new IllegalArgumentException("O numero de páginas deve ser maior que Zero");
			
		}
					
		this.numeroDepaginas = numeroDepaginas;
	}

	public double getPreco() {
		return preco;
	}

	private void setPreco(double preco) {
		
		if (preco <= 0) {
			throw new IllegalArgumentException("O preco precisa ser maior que Zero!!!");
		}
		
		this.preco = preco;
	}

	public Autor getAutor() {
		return autor;
	}

	private void setAutor(Autor autor) {
		if ( autor == null ) {
			throw new IllegalArgumentException("O autor não pode ser nulo");
		}
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	private void setCategoria(Categoria categoria) {
		if (categoria == null) {
			throw new IllegalArgumentException("A categoria não pode ser nula");
		}
		this.categoria = categoria;
	}
	
	

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", isbn=" + isbn + ", resumo=" + resumo + ", sumario=" + sumario
				+ ", numeroDepaginas=" + numeroDepaginas + ", preco=" + preco + ", autor=" + autor + ", categoria="
				+ categoria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Livro other = (Livro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	
	
}
