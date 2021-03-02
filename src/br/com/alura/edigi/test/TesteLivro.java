package br.com.alura.edigi.test;

import br.com.alura.edigi.dao.LivroDao;
import br.com.alura.edigi.model.Autor;
import br.com.alura.edigi.model.Categoria;
import br.com.alura.edigi.model.Livro;

public class TesteLivro {

	public static void main(String[] args) {
		
		LivroDao livrodao = new LivroDao();
		Livro livro = new Livro ("Java O.O", "978-16-12314-15-0" ,"LoLorem ipsum dolor amet, consectetur adipiscing elit. Nulla venenatis, ante sed pulvinar conpsum" , "1- Java O.O "  ,100, 20.00 , new Autor("suelen.aparecida@alura.com" , " Suelen" ," ABCDEF"), new Categoria("Tecnologia"));
		Livro livro2 = new Livro ("Java O.O", "978-16-12314-15-0" ,"LoLorem ipsum dolor amet, consectetur adipiscing elit. Nulla venenatis, ante sed pulvinar conpsum" , "1- Java O.O "  ,100, 20.00 , new Autor("suelen.aparecida@alura.com" , " Suelen" ," ABCDEF"), new Categoria("Tecnologia"));

		livrodao.inserindoLivro(livro);
		livrodao.inserindoLivro(livro2);
		
		
		System.out.println(livro);
		System.out.println(livro2);
		
		
		/*
		 * Categoria categoria = new Categoria("Tecnologia"); Livro livro = new
		 * Livro("Java O.O" , "978-16-12314-15-0",
		 * "LoLorem ipsum dolor amet, consectetur adipiscing elit. Nulla venenatis, ante sed pulvinar conpsum, in facilisis tortors"
		 * , "1- Java O.O ", 100, 39.90, autor, categoria); System.out.println(livro);
		 */
		
		
		
		
		
		
		
		
		
		
	}	
	
}
