package collections.set.model;

import java.util.*;

/**Dados as seguintes informaçôes sobre filmes favoritos,
 * crie um conjunto e ordene este conjunto exibindo:
 * (nome - genero - tempo); BSet não repete mesmo valores ou nomes dos conjuntos.
 *
 */
public class OrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Filme> meusFilmes = new HashSet<>(){{
            add(new Filme("Top Gan", "Ação", 90));
            add(new Filme("Gost", "Romance", 85));
            add(new Filme("Sherek", "Desenho", 78));
        }};
        for (Filme filme: meusFilmes) // condições aleatórias
            System.out.println(filme.getNome() + " - " + filme.getGenero() + " - " + filme.getTempoFilme() + " min.");

        System.out.println("--\tOrdem inserção\t--");
        Set<Filme> meusFilmesI = new LinkedHashSet<>(){{
            add(new Filme("Top Gan", "Ação",90));
            add(new Filme("Gost", "Romance",85));
            add(new Filme("Sherek", "Desenho",78));
        }};
        for (Filme filme:meusFilmesI)
            System.out.println(filme.getNome() + " - " + filme.getGenero() + " - " + filme.getTempoFilme() + " min.");

        System.out.println("--\tOrdem natural (Tempo filme)\t--");
        Set<Filme> meusFilmesII = new TreeSet<>(meusFilmesI);
        for (Filme filme: meusFilmesII) System.out.println(filme.getNome() + " - " + filme.getGenero() + " - " + filme.getTempoFilme() + " min.");


        System.out.println("--\tOrdem Nome/Gênero/TempoFilme\t--");
        Set<Filme>meusFilmesIII = new TreeSet<>(new NomeGeneroTempo() {
        });
        meusFilmesIII.addAll(meusFilmes);
        for (Filme filme: meusFilmesIII) System.out.println(filme.getNome() + " - " + filme.getGenero() + " - " + filme.getTempoFilme() + " min.");


        System.out.println("--\tOrdem Gênero\t--");
        Set<Filme>meusFilmes1 = new TreeSet<>(new Genero());
        meusFilmes1.addAll(meusFilmes);
        for (Filme filme: meusFilmes1) System.out.println(filme.getNome() + " - " + filme.getGenero() + " - " + filme.getTempoFilme() + " min.");


        System.out.println("--\tOrdem Tempo de Filme\t--");
        Set<Filme>meusFilmes2 = new TreeSet<>(new TempoFilme());
        meusFilmes2.addAll(meusFilmes);
        for (Filme filme: meusFilmes2)
            System.out.println(filme.getNome() + " - " + filme.getGenero() + " - " + filme.getTempoFilme() + " min.");
    }


}
