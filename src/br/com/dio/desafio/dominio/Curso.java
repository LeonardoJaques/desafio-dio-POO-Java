package br.com.dio.desafio.dominio;

/**
 * Curso is a class that extends the Conteudo class.
 * It represents a course in the system.
 * It contains information about the course's workload.
 */
public class Curso extends Conteudo {
    // The workload of the course
    private int cargaHoraria;

    /**
     * Default constructor for the Curso class.
     */
    public Curso() {
    }

    /**
     * Calculates the experience points for the course.
     * The base experience points are multiplied by the workload for courses.
     * @return The total experience points for the course.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    /**
     * Getter for the workload of the course.
     * @return The workload of the course.
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * Setter for the workload of the course.
     * @param cargaHoraria The workload to set for the course.
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * Provides a string representation of the Curso object.
     * @return A string representation of the Curso object.
     */
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }
}