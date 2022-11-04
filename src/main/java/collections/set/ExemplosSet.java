package collections.set;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class ExemplosSet {

    public static void main(String[] args) {

        System.out.println("Cria um conjunto e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 3.5, 9d, 0d, 4d));

        System.out.println(notas.toString());

//        System.out.println("Exiba a posição da nota 5.0: "); nõa exibi porque não tem função indexof e conjunto modo aleatorio.

//        System.out.println("Adicione na lista a nota 8.0 na posição 4: "); não conhece trabalha com posição no set.

 //       System.out.println("Substituia a nota 3.5 pela nota 6.0: "); não tem como fazer esta substituição no set.

        System.out.println("Confira se a nota 9.0 está no conjunto: " + notas.contains(9d));

        System.out.println("Exiba menor nota: " + Collections.min(notas));

        System.out.println("Exiba maior nota: " + Collections.max(notas));


        Iterator<Double>iterator = notas.iterator();
        Double soma = 0.0; // acumulando a soma ate chega no ultima nota e mostra resultado.
        while (iterator.hasNext()) { // perguta se tem proximo no conjunto se sim
            Double next = iterator.next(); // entra na variavel next e soma o proximo
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média da notas: " + (soma/ notas.size())); // utiliza esse método sabe a média das notas.

        System.out.println("Remova a nota 4.0: ");
        notas.remove(4d);
        System.out.println(notas);

        System.out.println("Remover as notas abaixo de 7.0: ");
        Iterator<Double>iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notasI = new LinkedHashSet<>();
        notasI.add(7d);
        notasI.add(5d);
        notasI.add(9d);
        notasI.add(7d);
        notasI.add(9.3);
        notasI.add(4.5);

        System.out.println(notasI);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notasII = new TreeSet<>(notasI);
        System.out.println(notasII);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());


    }
}
