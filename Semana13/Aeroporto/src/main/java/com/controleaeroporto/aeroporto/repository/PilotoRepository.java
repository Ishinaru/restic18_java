package com.controleaeroporto.aeroporto.repository;

import com.controleaeroporto.aeroporto.modelo.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotoRepository extends JpaRepository<Piloto, Long> {
}
