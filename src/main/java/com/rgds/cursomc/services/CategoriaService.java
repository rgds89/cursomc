package com.rgds.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgds.cursomc.business.CategoriaBusiness;
import com.rgds.cursomc.domain.Categoria;

@Service
public class CategoriaService {


	@Autowired
	CategoriaBusiness categoriaBusiness;

	public Categoria buscarCategoriaPorId(Integer id) {
		return categoriaBusiness.buscarCategoriaPorId(id);
	}
	
	public List<Categoria> buscarCategoria(){
		return categoriaBusiness.buscarCategoria();
	}

}
