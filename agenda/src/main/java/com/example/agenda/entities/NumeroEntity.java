package com.example.agenda.entities;

import com.example.agenda.dto.NumeroDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "numeros")
public class NumeroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String telefone;
    @Column(name = "categoria")
    @Enumerated(EnumType.STRING)
    private CategoriaEnum categoriaEnum = CategoriaEnum.WHATSAPP;

    public NumeroEntity(NumeroDto numeroDto) {
        this.id = numeroDto.getId();
        this.telefone = numeroDto.getTelefone();
        this.categoriaEnum = numeroDto.getCategoriaEnum();
    }

}
