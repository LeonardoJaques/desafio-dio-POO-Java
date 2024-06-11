package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * Mentoria is a class that extends the Conteudo class.
 * It represents a mentoring session in the system.
 */
public class Mentoria extends Conteudo {

    // The date of the mentoring session
    private LocalDate data;

    /**
     * Default constructor for the Mentoria class.
     */
    public Mentoria() {
    }

    /**
     * Getter for the date of the mentoring session.
     * @return The date of the mentoring session.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Setter for the date of the mentoring session.
     * @param data The date to set for the mentoring session.
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Calculates the experience points for the mentoring session.
     * The base experience points are increased by 20 for mentoring sessions.
     * @return The total experience points for the mentoring session.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    /**
     * Provides a string representation of the Mentoria object.
     * @return A string representation of the Mentoria object.
     */
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", data=" + data +
                '}';
    }
}