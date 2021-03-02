package br.com.alura.edigi.test;

import br.com.alura.edigi.dao.AutorDao;
import br.com.alura.edigi.model.Autor;

public class TesteAutor {

	public static void main(String[] args) {
		AutorDao autordao  = 	new AutorDao();
		
		Autor autor = new  Autor("suelen.aparecida@alura.com" , " Suelen" ," ABCDEF"); 
		Autor autor2 = new Autor ("suelen.aparecida@alura.com" , "Cássio" , "ABCDEF");
		autordao.inserindoAutor(autor);
		autordao.inserindoAutor(autor2);
		System.out.println(autor);
		System.out.println(autor2);
	}

}
