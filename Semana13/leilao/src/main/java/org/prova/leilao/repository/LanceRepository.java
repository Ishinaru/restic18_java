package org.prova.leilao.repository;

import org.prova.leilao.module.Lance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanceRepository extends JpaRepository<Lance, Long> {
    List<Lance> findByLeilaoAssociado(Long id);
    List<Lance> findByConcorrenteAssociado(Long id);

}
