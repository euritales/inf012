package com.example.agenda.dto;

import com.example.agenda.entities.ContatoEntity;
import com.example.agenda.entities.NumeroEntity;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class ContatoDto {

    private Long id;
    private String nome;
    private String email;
    private List<NumeroDto> ListNumero;

    public ContatoDto(ContatoEntity contatoEntity) {
        this.id = contatoEntity.getId();
        this.nome = contatoEntity.getNome();
        this.email = contatoEntity.getEmail();
        this.ListNumero = converteNumeros(contatoEntity.getListNumero());
    }

    public static List<ContatoDto> converteContatos(List<ContatoEntity> list){
        return list.stream().map(ContatoDto::new).collect(Collectors.toList());
    }

    public static List<NumeroDto> converteNumeros(List<NumeroEntity> list){
        return list.stream().map(NumeroDto::new).collect(Collectors.toList());
    }
}
