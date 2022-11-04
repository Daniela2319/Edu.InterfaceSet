package collections.set.model;

import java.util.Comparator;

public class Genero implements Comparator<Filme> {
    @Override
    public int compare(Filme filme1, Filme filme2) {
        int genero = filme1.getGenero().compareTo(filme2.getGenero());
        if (genero != 0) return genero;
        return CharSequence.compare(filme1.getGenero(), filme2.getGenero());
    }
}
