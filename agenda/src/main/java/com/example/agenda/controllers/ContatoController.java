package com.example.agenda.controllers;

import com.example.agenda.dto.ContatoDto;
import com.example.agenda.entities.ContatoEntity;
import com.example.agenda.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity salvarContato(@RequestBody ContatoDto contatoDto){
         service.salvarContato(contatoDto);
         return ResponseEntity.created(null).build();
    }

//    @PutMapping("/edit/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public ResponseEntity editarContato(@PathVariable Long id, @RequestBody ContatoDto contatoDto){
//        return ResponseEntity.ok(service.updateContato(contatoDto));
//    }


    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity salvarContato(@RequestBody ContatoEntity contatoEntity){
        ContatoDto contatoDto = service.salvarContato(contatoEntity);
        return ResponseEntity.created(null).build();
    }
    @DeleteMapping("{id}")
    public ResponseEntity<ContatoDto> apagarContato(@PathVariable Long id){
        return service.deleteContato(id);
    }
}


