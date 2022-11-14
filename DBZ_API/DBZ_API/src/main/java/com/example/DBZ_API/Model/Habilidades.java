package com.example.DBZ_API.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "habilidade")
public class Habilidades extends EntidadeGenerica {

    private String habilidade;

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public Habilidades(String habilidade) {
        this.habilidade = habilidade;
    }

    public Habilidades() {
    }
}
