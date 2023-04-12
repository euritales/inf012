package com.example.agenda.repositories;


import com.example.agenda.entities.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContatoRepository  extends JpaRepository<ContatoEntity, Long> {
    List<ContatoEntity> findByNome(String nome);

}