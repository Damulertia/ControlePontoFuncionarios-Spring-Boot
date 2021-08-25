package com.digitalinnovationone.ProjetoControleDePonto.repository;

import com.digitalinnovationone.ProjetoControleDePonto.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
