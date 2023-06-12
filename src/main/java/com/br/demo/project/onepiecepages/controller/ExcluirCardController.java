package com.br.demo.project.onepiecepages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.br.demo.project.onepiecepages.service.PersonagemService;

@Controller
public class ExcluirCardController {

	@Autowired
	private PersonagemService service;
	
	@GetMapping("/ExcluirCardController")
	public String excluir(@RequestParam("id") String id) {
		
		Long idPersonagem = Long.parseLong(id);
		
		service.delete(idPersonagem);
		
		return "redirect:/index";
	}
	
}
