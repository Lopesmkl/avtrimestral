package br.trimestral.senai.trimestral.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity(name = "filiais")
public class Filiais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    @Size(max = 100)
    private String nome;

    @Size(max = 150)
    private String localizacao;

    @Size(max = 100)
    private String razaoSocial;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Filiais{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
