package com.br.demo.project.onepiecepages.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "personagens")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Personagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String nome;
	@Column(length = 1000, name = "url_gif")
	private String urlGif;
	private String poder;
	private String corHabilidade;
	@Column(length = 1000)
	private String descricao;
	
	public Personagem(String nome, String urlGif, String poder, String descricao, String corHabilidade) {
		this.nome = nome;
		this.urlGif = urlGif;
		this.poder = poder;
		this.descricao = descricao;
		this.corHabilidade = corHabilidade;
	}
	
}
