package collections.set.model;

import java.util.Comparator;

public class NomeGeneroTempo implements Comparator<Filme> {
    @Override
    public int compare(Filme filme1, Filme filme2) {
        int nome = filme1.getNome().compareTo(filme2.getNome());
        if (nome != 0) return nome;

        int genero = filme1.getGenero().compareTo(filme2.getGenero());
        if (genero != 0) return genero;

        int tempoFilme = filme1.getTempoFilme().compareTo(filme2.getTempoFilme());
        if (tempoFilme != 0) return tempoFilme;

        return Integer.compare(filme1.getTempoFilme(), filme2.getTempoFilme());
    }
}
