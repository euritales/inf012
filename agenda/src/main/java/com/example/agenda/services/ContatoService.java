package com.example.agenda.services;

import com.example.agenda.dto.ContatoDto;
import com.example.agenda.dto.NumeroDto;
import com.example.agenda.entities.ContatoEntity;
import com.example.agenda.entities.NumeroEntity;
import com.example.agenda.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;



//    public List<NumeroDto> numeroToDto(List<NumeroEntity> list){
//        list.stream().map(n -> new NumeroDto(n)).collect(Collectors.toList());
//    }

//    public List<ContatoDto> contatoToDto(List<ContatoEntity> list){
//        return list.stream().map(
//                contatoEntity -> new ContatoDto(
//                        contatoEntity.getId(),
//                        contatoEntity.getEmail(),
//                        contatoEntity.getNome(),
//                        numeroToDto(contatoEntity.getListNumero())
//        ).collect(Collectors.toList());
//    }

    public List<ContatoDto> getAllContatos(){
       return repository.findAll().stream().map(contatoEntity -> new ContatoDto(contatoEntity)).collect(Collectors.toList());
    }

    public List<ContatoDto> getByNome(String nome) {

           return repository.findByNome(nome).stream().map(ContatoDto::new).toList();
    }

    public Optional<ContatoDto> GetById(Long id) {
        return  repository.findById(id).map(ContatoDto::new);
    }
}
