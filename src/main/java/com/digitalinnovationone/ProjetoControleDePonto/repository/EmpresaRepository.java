package com.digitalinnovationone.ProjetoControleDePonto.repository;

import com.digitalinnovationone.ProjetoControleDePonto.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
