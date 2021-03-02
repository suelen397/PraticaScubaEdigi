package br.com.alura.edigi.dao;

import java.util.ArrayList;
import java.util.List;


import br.com.alura.edigi.model.Categoria;

public class CategoriaDao {
	
	public static List<Categoria> bancoCategoria = new ArrayList<>();
	
	public void  inserindoCategoria (Categoria categoria) {
		if(CategoriaDao.bancoCategoria.contains(categoria)) {
			throw new RuntimeException("Categoria já cadastrada no sistema!!!");
		}
		CategoriaDao.bancoCategoria.add(categoria);
	}
}
