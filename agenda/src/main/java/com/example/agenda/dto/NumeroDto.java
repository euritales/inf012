package com.example.agenda.dto;

import com.example.agenda.entities.CategoriaEnum;
import com.example.agenda.entities.NumeroEntity;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class NumeroDto {

    private Long id;
    private String telefone;
    private CategoriaEnum categoriaEnum;

//    public NumeroDto(NumeroEntity numeroEntity){
//        this.id = numeroEntity.getId();
//        this.telefone = numeroEntity.getTelefone();
//        this.categoriaEnum = numeroEntity.getCategoriaEnum();
//    }

    public static NumeroDto create(NumeroEntity numeroEntity){
        ModelMapper modelMapper = new ModelMapper();
         return modelMapper.map(numeroEntity, NumeroDto.class);
    }
}
