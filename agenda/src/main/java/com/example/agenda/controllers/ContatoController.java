package com.example.agenda.controllers;

import com.example.agenda.dto.ContatoDTO;
import com.example.agenda.entities.ContatoEntity;
import com.example.agenda.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contatos")
public class ContatoController {

    @Autowired
    private ContatoService service;
//    @GetMapping
//    public String teste(){
//        return "Teste";
//    }
    @GetMapping
    public ResponseEntity<List<ContatoDTO>> listarTodosContatos(){
        return (ResponseEntity<List<ContatoDTO>>) service.findAll();
    }

//    @GetMapping("/{id}")
//    public Optional<ContatoDTO> listarContatoPorId(@PathVariable("id") Long id){
//        return service.findById(id);
//    }

}
