package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * Dev is a class that represents a developer in the system.
 * It contains information about the developer's name, the contents they are subscribed to, and the contents they have completed.
 */
public class Dev {
    // The name of the developer
    private String nome;
    // The contents the developer is subscribed to
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    // The contents the developer has completed
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Method to subscribe the developer to a bootcamp.
     * It adds all the contents of the bootcamp to the developer's subscribed contents and adds the developer to the bootcamp's list of subscribed developers.
     * @param bootcamp The bootcamp to subscribe to.
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * Method for the developer to progress through their contents.
     * If there are any contents the developer is subscribed to, it moves the first one to the list of completed contents.
     * If there are no contents, it prints an error message.
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo.");
        }
    }

    /**
     * Method to calculate the total experience points of the developer.
     * It sums up the experience points of all the contents the developer has completed.
     * @return The total experience points of the developer.
     */
    public double calcularTotalXP() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    // Getters and setters for the developer's name, subscribed contents, and completed contents

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // Overridden equals and hashCode methods for the Dev class

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}