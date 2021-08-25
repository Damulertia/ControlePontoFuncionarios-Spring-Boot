package com.digitalinnovationone.ProjetoControleDePonto.repository;

import com.digitalinnovationone.ProjetoControleDePonto.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long> {
}
