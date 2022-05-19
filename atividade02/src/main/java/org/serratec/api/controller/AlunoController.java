package org.serratec.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.serratec.api.model.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	private static List<Aluno> lista = new ArrayList<>();
	
	static {
		lista.add(new Aluno (1,"Rodrigo","2199999999"));
		lista.add(new Aluno (2,"Ariane","2199999699"));
		lista.add(new Aluno (3,"Ravi","2199994999"));
	}
	@GetMapping
	public List<Aluno> listar(){
		return lista;
	}
	
	@GetMapping("{matricula}")
	public Aluno buscar(@PathVariable int matricula) {
		return lista.stream().filter(a -> a.getMatricula().equals(matricula)).findFirst().orElse(null);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Aluno inserir(@RequestBody Aluno aluno) {
		lista.add(aluno);
		return aluno;
	}
	@DeleteMapping("{matricula}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void apagar(@PathVariable int matricula) {
		for (int i =0; i < lista.size();i++) {
			if (lista.get(i).getMatricula().equals(matricula)) {
				lista.remove(i);
			}
		}
	}
	@PutMapping("{matricula}")
	public Aluno atualizar(@RequestBody Aluno aluno, @PathVariable int matricula) {
	for (int i =0; i < lista.size();i++) {
		if (lista.get(i).getMatricula().equals(matricula)) {
			Aluno a = new Aluno (aluno.getMatricula(), aluno.getNome(),aluno.getTelefone());
			lista.set(i, a);
			return a;
		}
	}
	return null;
	}
}