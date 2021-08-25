package com.digitalinnovationone.ProjetoControleDePonto.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Ocorrencia {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String descricao;
}
