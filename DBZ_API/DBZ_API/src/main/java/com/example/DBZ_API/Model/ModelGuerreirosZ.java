package com.example.DBZ_API.Model;

import javax.persistence.*;
import java.util.List;
@Entity()
@Table(schema = "guerreiros")
public class ModelGuerreirosZ extends EntidadeGenerica {
    @Column(name = "guerreiro_z")
    private String nome;
    @Enumerated(EnumType.STRING)
    private  StatusGuerreiro statusGuerreiro;

    @OneToMany
    @JoinColumn(name = "habilidade_id")
    private List<Habilidades> habilidades;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusGuerreiro getStatusGuerreiro() {
        return statusGuerreiro;
    }

    public void setStatusGuerreiro(StatusGuerreiro statusGuerreiro) {
        this.statusGuerreiro = statusGuerreiro;
    }

    public List<Habilidades> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidades> habilidades) {
        this.habilidades = habilidades;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ModelGuerreirosZ(String nome, StatusGuerreiro statusGuerreiro, List<Habilidades> habilidades, Endereco endereco) {
        this.nome = nome;
        this.statusGuerreiro = statusGuerreiro;
        this.habilidades = habilidades;
        this.endereco = endereco;
    }

    public ModelGuerreirosZ() {
    }
}
