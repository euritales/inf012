package com.example.Consultorio.repository;

import com.example.Consultorio.entities.ConsultaEntity;
import com.example.Consultorio.entities.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<ConsultaEntity, Long> {
}