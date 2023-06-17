package com.example.Consultorio.dto;

import com.example.Consultorio.entities.ConsultaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaDTO {
    private Long id;
    private PacienteDTO paciente;
    private MedicoDTO medico;
    private LocalDateTime dataHora;

    public static ConsultaDTO fromEntity(ConsultaEntity consultaEntity) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(consultaEntity, ConsultaDTO.class);
    }

    public ConsultaEntity toEntity(ConsultaDTO consultaDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(consultaDTO, ConsultaEntity.class);
    }
//    public ConsultaEntity toEntity() {
//        return modelMapper.map(this, ConsultaEntity.class);
//    }
}
