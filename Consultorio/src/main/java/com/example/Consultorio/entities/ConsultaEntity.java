package com.example.Consultorio.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "consulta")
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private PacienteEntity paciente;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private MedicoEntity medico;

    private LocalDateTime dataHora;
}

