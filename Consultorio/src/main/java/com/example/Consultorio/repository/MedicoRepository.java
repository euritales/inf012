package com.example.Consultorio.repository;

import com.example.Consultorio.entities.MedicoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<MedicoEntity, Long> {
    Page<MedicoEntity> findAllByOrderByNomeAsc(Pageable pageable);
    Page<MedicoEntity> findAllByStatusTrueOrderByNomeAsc(Pageable pageable);

}
