package com.example.agenda.entities;

import com.example.agenda.dto.ContatoDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "contatos")
public class ContatoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "contato_id")
    private List<NumeroEntity> ListNumero;

    public ContatoEntity(ContatoDto dto) {
        this.id = dto.getId();
        this.nome = dto.getNome();
        this.email = dto.getEmail();
        ListNumero = dto.getListNumero().stream().map(NumeroEntity::new).collect(Collectors.toList());
    }
}
