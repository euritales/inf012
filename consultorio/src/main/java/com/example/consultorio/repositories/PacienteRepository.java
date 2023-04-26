package com.example.consultorio.repositories;

import com.example.consultorio.entities.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PacienteRepository extends JpaRepository<PacienteEntity, Long> {

//    List<PacienteEntity> buscaPorNome(String nome);
}
