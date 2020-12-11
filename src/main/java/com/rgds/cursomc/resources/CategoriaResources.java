package com.rgds.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rgds.cursomc.domain.Categoria;
import com.rgds.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

	@Autowired
	CategoriaService categoriaService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarPorId(@PathVariable Integer id) {

		Categoria categoria = categoriaService.buscarCategoriaPorId(id);

		return ResponseEntity.ok().body(categoria);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> buscar() {

		List<Categoria> categoria = categoriaService.buscarCategoria();

		return ResponseEntity.ok().body(categoria);
	}

}
