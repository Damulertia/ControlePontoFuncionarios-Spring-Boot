package com.digitalinnovationone.ProjetoControleDePonto.repository;

import com.digitalinnovationone.ProjetoControleDePonto.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}
