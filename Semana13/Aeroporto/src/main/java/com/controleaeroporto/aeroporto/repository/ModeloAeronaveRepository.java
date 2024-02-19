package com.controleaeroporto.aeroporto.repository;

import com.controleaeroporto.aeroporto.modelo.ModeloAeronave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloAeronaveRepository extends JpaRepository<ModeloAeronave, Long> {
}
