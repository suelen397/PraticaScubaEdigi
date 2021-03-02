package br.com.alura.edigi.test;

import br.com.alura.edigi.model.Autor;
import br.com.alura.edigi.model.Categoria;
import br.com.alura.edigi.model.Livro;

public class TestTryCatch {
	public static void main(String[] args) {
		String resumo  = "LoLorem ipsum dolor amet, consectetur adipiscing elit. Nulla venenatis, ante sed pulvinar conpsum, in facilisis tortors";
		double preco = 30.00;
		try {
			System.out.println("Testando o nome do Livro para verificar se não é vazio");	
			new Livro(null, "978-16-12314-15-0", resumo,  "1- Java O.O " ,100, preco , new Autor("suelen.aparecida@alura.com" , " Suelen" ," ABCDEF"), new Categoria("Tecnologia"));
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage() + "\n");
		}
		try {
			System.out.println("Testando o ISBN do Livro");
			new Livro("Java O.O", "666-78-12314-16-0" , resumo, "1- Java O.O " ,100, preco , new Autor("suelen.aparecida@alura.com" , " Suelen" ," ABCDEF"), new Categoria("Tecnologia"));
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage() + "\n");
		}
		try {
			System.out.println("Testando o Resumo do Livro");
			new Livro("Java O.O", "978-16-12314-15-0" ,null,  "1- Java O.O ",100, preco , new Autor("suelen.aparecida@alura.com" , " Suelen" ," ABCDEF"), new Categoria("Tecnologia"));
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage() + "\n");
		}
		try {
			System.out.println("Testando o Sumário do Livro");
			new Livro("Java O.O", "978-16-12314-15-0" ,resumo,  null ,100, preco , new Autor("suelen.aparecida@alura.com" , " Suelen" ," ABCDEF"), new Categoria("Tecnologia"));
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage() + "\n");
		}
		try {
			System.out.println("Testando o numero de páginas do Livro");
			new Livro("Java O.O", "978-16-12314-15-0" ,resumo, "1- Java O.O "  ,0, preco , new Autor("suelen.aparecida@alura.com" , " Suelen" ," ABCDEF"), new Categoria("Tecnologia"));
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage() + "\n");
		}
		try {
			System.out.println("Testando o preco do Livro");
			new Livro("Java O.O", "978-16-12314-15-0" ,resumo, "1- Java O.O "  ,100, 0 , new Autor("suelen.aparecida@alura.com" , " Suelen" ," ABCDEF"), new Categoria("Tecnologia"));
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage() + "\n");
		}
		try {
			System.out.println("Testando o Autor do Livro");
			new Livro("Java O.O", "978-16-12314-15-0" ,resumo, "1- Java O.O "  ,100, preco , new Autor("suelen123@.." , " Suellen" ," ABCD"), new Categoria("Tecnologia"));
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage() + "\n");
		}
		try {
			System.out.println("Testando a Categoria do Livro");
			new Livro("Java O.O", "978-16-12314-15-0" ,resumo, "1- Java O.O "  ,100, preco , new Autor("suelen.aparecida@alura.com" , " Suelen" ," ABCDEF"), new Categoria(" "));
		} catch (IllegalArgumentException error) {
			System.out.println(error.getMessage() + "\n");
		}
	}
}

