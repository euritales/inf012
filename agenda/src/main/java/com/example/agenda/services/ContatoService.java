package com.example.agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.entities.ContatoEntity;
import com.example.agenda.repositories.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository repository;

	public List<ContatoEntity> findAll() {
		return repository.findAll();
	}

}
