package collections.set.model;

import java.util.Comparator;

public class TempoFilme implements Comparator<Filme> {
    @Override
    public int compare(Filme filme1, Filme filme2) {
        int tempo = filme1.getTempoFilme().compareTo(filme2.getTempoFilme());
        if ( tempo != 0) return tempo;
        return Integer.compare(filme1.getTempoFilme(),filme2.getTempoFilme());
    }
}
