package br.com.alura.edigi.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.edigi.model.Livro;

public class LivroDao {
	
	public static List<Livro> bancoLivro  = new ArrayList<>();
	
	public void inserindoLivro (Livro livro) {
		if(LivroDao.bancoLivro.contains(livro)) {
			throw new RuntimeException("Livro já cadastrado no Sistema!!!");
		}
			LivroDao.bancoLivro.add(livro);
	}
}
