package com.example.consultorio.entities;

import com.example.consultorio.dto.PacienteDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "pacientes")
public class PacienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Boolean status = true;

    public PacienteEntity(PacienteDTO pacienteDTO) {
        this.id = pacienteDTO.getId();
        this.nome = pacienteDTO.getNome();
        this.email = pacienteDTO.getEmail();
        this.telefone = pacienteDTO.getTelefone();
        this.cpf = pacienteDTO.getCpf();
        this.status = pacienteDTO.getStatus();
    }


}
