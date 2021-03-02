package br.com.alura.edigi.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.edigi.model.Autor;


public class AutorDao {
	
	public static List<Autor> bancoAutor = new ArrayList<>();
	
	public void inserindoAutor (Autor autor) {
		
		if(AutorDao.bancoAutor.contains(autor)) {
			throw new RuntimeException("Autor já cadastrado no sistema!!!");
		}
		AutorDao.bancoAutor.add(autor);

	}
}
