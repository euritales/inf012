package com.example.Consultorio.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "medico")
@AllArgsConstructor
@NoArgsConstructor
public class MedicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String email;
    private String telefone;
    @NotNull
    private String crm;
    @NotNull
    private String especialidade;
    @NotNull
    private boolean status;
    @NotNull
    @Embedded
    private Endereco endereco;

}

