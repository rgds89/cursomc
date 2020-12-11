package com.rgds.cursomc.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rgds.cursomc.domain.Categoria;
import com.rgds.cursomc.repositories.CategoriaRepository;

@Component
public class CategoriaBusiness {

	@Autowired
	CategoriaRepository categoriaRepository;

	public Categoria buscarCategoriaPorId(Integer id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		return categoria.orElse(null);
	}

	public List<Categoria> buscarCategoria() {
		return categoriaRepository.findAll();
	}

}
