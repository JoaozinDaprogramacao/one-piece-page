package com.br.demo.project.onepiecepages.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.br.demo.project.onepiecepages.model.Personagem;
import com.br.demo.project.onepiecepages.service.PersonagemService;


@Controller 
public class IndexController {
	
	@Autowired
	private PersonagemService service;
	
	@GetMapping("/index")
	public String index(Model model) {
		
		ArrayList<Personagem> personagens = service.getAll();
		
		model.addAttribute("personagens", personagens);
		
		return "index";
		
	}
	
}
