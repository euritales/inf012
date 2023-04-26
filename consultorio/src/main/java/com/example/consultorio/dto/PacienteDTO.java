package com.example.consultorio.dto;

import com.example.consultorio.entities.PacienteEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PacienteDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    private Boolean status = true;

    public PacienteDTO(PacienteEntity paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.email = paciente.getEmail();
        this.telefone = paciente.getTelefone();
        this.cpf = paciente.getCpf();
        this.status = paciente.getStatus();
    }



//    public static List<PacienteEntity> converteDTO(List<PacienteDTO> list){
//
//        return list.stream().map(
//                PacienteEntity::new
//        )
//    }
//    public static PacienteEntity converteDTO(PacienteDTO pacienteDTO) {
//         PacienteEntity pacienteEntity = new PacienteEntity(pacienteDTO);
//    }
}
