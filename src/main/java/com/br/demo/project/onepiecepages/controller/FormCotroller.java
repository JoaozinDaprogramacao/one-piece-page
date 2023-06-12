package com.br.demo.project.onepiecepages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormCotroller {

	@GetMapping("/formulario")
	public String formulario() {
		return "paginaAdcCard";
	}
	
}
