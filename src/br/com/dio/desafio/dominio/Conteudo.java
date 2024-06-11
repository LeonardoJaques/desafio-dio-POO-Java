package br.com.dio.desafio.dominio;

/**
 * Conteudo is an abstract class that represents a content in the system.
 * It contains information about the content's title and description.
 * It also defines a method to calculate the experience points for the content.
 */
public abstract class Conteudo {
    // The default experience points for a content
    protected static final double XP_PADRAO = 10d;

    // The title of the content
    private String titulo;
    // The description of the content
    private String descricao;

    /**
     * Abstract method to calculate the experience points for the content.
     * This method must be overridden by subclasses.
     * @return The experience points for the content.
     */
    public abstract double calcularXp();

    /**
     * Getter for the title of the content.
     * @return The title of the content.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter for the title of the content.
     * @param titulo The title to set for the content.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter for the description of the content.
     * @return The description of the content.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Setter for the description of the content.
     * @param descricao The description to set for the content.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}