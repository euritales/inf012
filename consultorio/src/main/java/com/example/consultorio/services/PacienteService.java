package com.example.consultorio.services;

import com.example.consultorio.dto.PacienteDTO;
import com.example.consultorio.entities.PacienteEntity;
import com.example.consultorio.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<PacienteDTO> listarPacientes(){
        return repository.findAll().stream().map(
                PacienteDTO::new
        ).collect(Collectors.toList());
    }

    public Optional<PacienteDTO> buscaPorId(Long id) {
        return repository.findById(id).map(PacienteDTO::new);
    }

    public ResponseEntity salvarPaciente(PacienteDTO pacienteDTO) {
        PacienteEntity pacienteEntity = new PacienteEntity(pacienteDTO);
        Assert.isNull(pacienteEntity.getId(), "nao foi possivel salvar este registro");
        PacienteEntity paciente = new PacienteEntity((pacienteDTO));
        return ResponseEntity.created(null).build();
    }


//    public void editarFicha(Long id, PacienteDTO pacienteDTO) {
//        Assert.notNull(pacienteDTO.getId(), "nao foi possivel salvar este registro");
//
//    }


    //    public List<PacienteDTO> buscaPorNome(String nome) {
    //        return repository.buscaPorNome(nome).stream().map(
    //                PacienteDTO::new
    //        ).collect(Collectors.toList());
    //    }


//    public Object buscaPorId(Long id) {
//
//    }
}
