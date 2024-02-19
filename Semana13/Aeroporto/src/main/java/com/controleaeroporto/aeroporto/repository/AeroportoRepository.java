package com.controleaeroporto.aeroporto.repository;

import com.controleaeroporto.aeroporto.modelo.Aeroporto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeroportoRepository extends JpaRepository<Aeroporto, Long> {
}
