package com.example.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.agenda.entities.ContatoEntity;
import com.example.agenda.services.ContatoService;

@RestController
@RequestMapping("/api")
public class ContatoController {

	@Autowired
	private ContatoService service;


	@GetMapping("/contatos")
	public List<ContatoEntity> ListarTodosContatos() {
		return service.findAll();
	}
	
	
//	@RequestMapping("/ola")
//	public String ola() {
//		return "ola";
//	}
}
