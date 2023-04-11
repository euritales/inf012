package com.example.agenda.repositories;


import com.example.agenda.entities.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository  extends JpaRepository<ContatoEntity, Long> {

}