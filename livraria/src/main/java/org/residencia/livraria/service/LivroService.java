package org.residencia.livraria.service;

import org.residencia.livraria.entidade.Livro;
import org.residencia.livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

		@Autowired
		LivroRepository livroRepository;
		
		public void salvar(Livro livro) {
			livroRepository.save(livro);
			
		}
}
