package com.bodyesthetic.studio.repository;

import com.bodyesthetic.studio.model.Resultados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultadosRepository extends JpaRepository<Resultados, Long> {
}
