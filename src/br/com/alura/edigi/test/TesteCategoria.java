package br.com.alura.edigi.test;


import br.com.alura.edigi.dao.CategoriaDao;
import br.com.alura.edigi.model.Categoria;

public class TesteCategoria {
	public static void main(String[] args) {
		
		CategoriaDao categoriadao = new CategoriaDao();
		
		Categoria categoria = new  Categoria("Tecnologia"); 
		Categoria categoria2 = new Categoria("Romance");
		categoriadao.inserindoCategoria(categoria);
		categoriadao.inserindoCategoria(categoria2);
		
		System.out.println(categoria);
		System.out.println(categoria2);
	}
	
}
