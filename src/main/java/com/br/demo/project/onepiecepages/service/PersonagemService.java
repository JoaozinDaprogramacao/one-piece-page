package com.br.demo.project.onepiecepages.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.demo.project.onepiecepages.model.Personagem;
import com.br.demo.project.onepiecepages.repository.PersonagemRepository;

@Service
public class PersonagemService {

	private PersonagemRepository repository;

	
	@Autowired	
	public PersonagemService(PersonagemRepository repository) {
		this.repository = repository;
	}

	public void save(String nome, String urlGif, String poder, String descricao, String cor) {
		
		Personagem personagem = new Personagem(nome, urlGif, poder, descricao, cor);
		
		repository.save(personagem);
		
	}
	
	public ArrayList<Personagem> getAll() {
		return (ArrayList<Personagem>) repository.findAll();
		
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
