package com.example.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.agenda.entities.ContatoEntity;

public interface ContatoRepository  extends JpaRepository<ContatoEntity, Long>{

}
