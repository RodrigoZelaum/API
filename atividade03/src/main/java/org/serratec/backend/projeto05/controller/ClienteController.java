package org.serratec.backend.projeto05.controller;

import org.serratec.backend.projeto05.model.Cliente;
import org.serratec.backend.projeto05.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@PostMapping("/salvar")
	public ResponseEntity<Void> salvar(@RequestBody Cliente cliente){
		clienteService.salvar(cliente);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
