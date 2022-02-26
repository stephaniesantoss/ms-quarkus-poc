package com.br.hibernate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Produto {

    @Id
    private Long id;
    private String nome;
}
