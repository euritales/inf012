package com.example.agenda.dto;

import com.example.agenda.entities.CategoriaEnum;
import com.example.agenda.entities.NumeroEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class NumeroDto {

    private Long id;
    private String telefone;
    private CategoriaEnum categoriaEnum;

    public NumeroDto(NumeroEntity numeroEntity){
        this.id = numeroEntity.getId();
        this.telefone = numeroEntity.getTelefone();
        this.categoriaEnum = numeroEntity.getCategoriaEnum();
    }
}
