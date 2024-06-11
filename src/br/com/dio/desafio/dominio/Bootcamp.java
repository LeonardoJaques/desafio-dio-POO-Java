package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Bootcamp is a class that represents a bootcamp in the system.
 * It contains information about the bootcamp's name, description, start and end dates, the developers subscribed to it, and the contents of the bootcamp.
 */
public class Bootcamp {
    // The name of the bootcamp
    private String nome;
    // The description of the bootcamp
    private String descricao;
    // The start date of the bootcamp, which is the current date
    private final LocalDate dataInicial = LocalDate.now();
    // The end date of the bootcamp, which is 45 days after the start date
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    // The developers subscribed to the bootcamp
    private Set<Dev> devsInscritos = new HashSet<>();
    // The contents of the bootcamp
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    // Getters and setters for the bootcamp's name, description, start and end dates, subscribed developers, and contents

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    // Overridden equals and hashCode methods for the Bootcamp class

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}