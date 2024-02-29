package org.prova.leilao.repository;

import org.prova.leilao.module.Leilao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeilaoRepository extends JpaRepository<Leilao, Long> {
}
