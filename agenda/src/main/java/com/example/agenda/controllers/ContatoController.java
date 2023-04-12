package com.example.agenda.controllers;

import com.example.agenda.dto.ContatoDto;
import com.example.agenda.entities.ContatoEntity;
import com.example.agenda.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/id/{id}")
    public ResponseEntity listarContatoPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.GetById(id));
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity listarContatoPorNome(@PathVariable("nome") String nome){
        return ResponseEntity.ok(service.getByNome(nome));
    }

    @PostMapping()
    public ResponseEntity salvarContato(@RequestBody ContatoEntity contatoEntity){
        
        return ResponseEntity.created(null).build();
    }
}
