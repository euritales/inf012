package com.example.agenda.services;

import com.example.agenda.dto.ContatoDto;
import com.example.agenda.entities.ContatoEntity;
import com.example.agenda.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;


    public List<ContatoDto> getAllContatos(){
//       return repository.findAll().stream().map(contatoEntity -> new ContatoDto(contatoEntity)).collect(Collectors.toList());
       return repository.findAll().stream().
               map(ContatoDto::new)
               .collect(Collectors.toList());
    }


    public Optional<ContatoDto> GetById(Long id) {
        return  repository.findById(id).map(ContatoDto::new);
    }
    public List<ContatoDto> getByNome(String nome) {
           return repository.findByNome(nome).stream().map(ContatoDto::new).toList();
    }

    public ContatoEntity salvarContato(ContatoDto contatoDto){
        Assert.isNull(contatoDto.getId(), "nao foi possivel salvar registro");
        ContatoEntity contato = new ContatoEntity(contatoDto);
        return repository.save(contato);
    }
}
