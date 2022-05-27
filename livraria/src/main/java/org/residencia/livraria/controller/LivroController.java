package org.residencia.livraria.controller;

import org.residencia.livraria.entidade.Livro;
import org.residencia.livraria.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class LivroController {
	
	@Autowired
	LivroService livroService;
	
	@PostMapping("/livro")
	public ResponseEntity<Void> salvar(@RequestBody Livro livro){
		livroService.salvar(livro);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
