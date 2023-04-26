package com.example.consultorio.controlers;

import com.example.consultorio.dto.PacienteDTO;
import com.example.consultorio.entities.PacienteEntity;
import com.example.consultorio.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService service;
//    @GetMapping
//    ResponseEntity (){
//        return "Ola, Manel";
//    }

    @GetMapping
    ResponseEntity listarPaciente(){
        return ResponseEntity.ok(service.listarPacientes());
    }
    @GetMapping("/{id}")
    ResponseEntity buscaPorId(@PathVariable Long id){
        return ResponseEntity.ok(service.buscaPorId(id));
    }

//    @GetMapping("/{nome}")
//    ResponseEntity buscaPorNome(@PathVariable String nome){
//        return ResponseEntity.ok(service.buscaPorNome(nome));
//    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity salvarPaciente(@RequestBody PacienteDTO pacienteDTO){
        service.salvarPaciente(pacienteDTO);
        return ResponseEntity.created(null).build();
    }

//    @PutMapping("/{id}")
//    ResponseEntity editarPaciente(@PathVariable Long id, @RequestBody PacienteDTO pacienteDTO){
//        service.editarFicha(id, pacienteDTO);
//    }

}
