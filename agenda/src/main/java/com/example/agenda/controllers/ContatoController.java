package com.example.agenda.controllers;

import com.example.agenda.dto.ContatoDto;
import com.example.agenda.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contatos")
public class ContatoController {

    @Autowired
    private ContatoService service;

    @GetMapping()
    public ResponseEntity listarTodosContatos(){
        return ResponseEntity.ok(service.getAllContatos());
    }

    @GetMapping("/{id}")
    public ResponseEntity listarContatoPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.GetById(id));
    }

}
