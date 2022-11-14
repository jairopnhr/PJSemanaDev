package com.example.DBZ_API.Model;

import javax.persistence.*;
import java.util.List;
@Table(schema = "endereco")
@Entity
public class Endereco extends EntidadeGenerica {
    @Column(name = "planeta_guerreiros")
    private String planeta;
    @Column(name = "cidade_guerreiros")
    private String cidade;
    @JoinColumn(name = "guerreiros_id")
    @OneToMany
    private List<ModelGuerreirosZ> habitantes;

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<ModelGuerreirosZ> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(List<ModelGuerreirosZ> habitantes) {
        this.habitantes = habitantes;
    }

    public Endereco(String planeta, String cidade, List<ModelGuerreirosZ> habitantes) {
        this.planeta = planeta;
        this.cidade = cidade;
        this.habitantes = habitantes;
    }

    public Endereco() {
    }
}
