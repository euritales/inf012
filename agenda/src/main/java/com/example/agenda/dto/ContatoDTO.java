package com.example.agenda.dto;

import com.example.agenda.entities.ContatoEntity;
import com.example.agenda.entities.NumeroEntity;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class ContatoDTO {
    private Long id;
    private String nome;
    private String email;
    private List<NumeroEntity> ListNumero;

    public ContatoDTO(ContatoEntity contatoEntity){
        this.id = contatoEntity.getId();
        this.nome = contatoEntity.getNome();
        this.email = contatoEntity.getEmail();
        this.ListNumero = contatoEntity.getListNumero();
    }

    public static List<ContatoDTO> entityParaDto(List<ContatoEntity> list){
        return list.stream().map(ContatoDTO::new).collect(Collectors.toList());
    }

}
