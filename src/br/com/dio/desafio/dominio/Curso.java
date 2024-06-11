package br.com.dio.desafio.dominio;

public class Curso {

    public Curso() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String titulo;
    private int duracaoHoras;
    private String descricao;

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", duracaoHoras=" + duracaoHoras +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
