package collections.set.model;

import java.util.Objects;

public class Filme implements Comparable<Filme> {

    //atributos
    private String nome;
    private String genero;
    private Integer tempoFilme;

    //construtor

    public Filme(String nome, String genero, Integer tempoFilme) {
        this.nome = nome;
        this.genero = genero;
        this.tempoFilme = tempoFilme;
    }

    //getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoFilme() {
        return tempoFilme;
    }

    public void setTempoFilme(Integer tempoFilme) {
        this.tempoFilme = tempoFilme;
    }

    //toString
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoFilme=" + tempoFilme +
                '}';
    }

    // método equals e hashCode comparar objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(nome, filme.nome) && Objects.equals(genero, filme.genero) && Objects.equals(tempoFilme, filme.tempoFilme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoFilme);
    }

    @Override
    public int compareTo(Filme filme) {
        int tempo =Integer.compare(this.getTempoFilme(), filme.getTempoFilme());
        if (tempo != 0) return tempo;
        return this.getGenero().compareTo(filme.getGenero());
    }
}
