package com.br.demo.project.onepiecepages.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.demo.project.onepiecepages.model.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long>{

}
