package com.br.demo.project.onepiecepages.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.br.demo.project.onepiecepages.service.PersonagemService;

@Controller
public class AdicionaPersonagemController {
	
	@Autowired
	private PersonagemService service;
	
	@GetMapping("/adicionaPersonagem")
	public String adicionaPersonagem(@RequestParam("nome") String nome,
            @RequestParam("imagem") String imagem,
            @RequestParam("habilidade") String habilidade,
            @RequestParam("descricao") String descricao,
            @RequestParam("cor") String cor) {
		
		
		service.save(nome, imagem, habilidade, descricao, cor);
		
		return "redirect:/index";
	}
	
}
