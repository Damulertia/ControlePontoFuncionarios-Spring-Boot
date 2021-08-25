package com.digitalinnovationone.ProjetoControleDePonto.repository;

import com.digitalinnovationone.ProjetoControleDePonto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {


}
