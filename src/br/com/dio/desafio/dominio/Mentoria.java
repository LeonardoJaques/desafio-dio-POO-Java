package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    public Mentoria() {
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    private String titulo;
    private int duracaoHoras;
    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", duracaoHoras=" + duracaoHoras +
                ", data=" + data +
                '}';
    }
}
