package com.example.agenda.services;

import com.example.agenda.dto.ContatoDTO;
import com.example.agenda.entities.ContatoEntity;
import com.example.agenda.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;


    public List<ContatoDTO> findAll(){
        return ContatoDTO.entityParaDto(repository.findAll());

//       return repository.findAll().stream().map(contatoEntity -> new ContatoDTO(contatoEntity)).collect(Collectors.toList());
    }

//    public Optional<ContatoDTO> findById(Long id) {
//
//           return ContatoDTO::entityParaDto;entityParaDto(repository.findById(id));
//
//    }
}
