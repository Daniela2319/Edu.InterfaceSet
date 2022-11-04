

# Interface Set

Set é uma interface de estruturas de coleção que estende a interface de coleções raiz.

A coleções de conjuntos não pode conter elementos duplicados.

A interface Set possui todos os métodos que são herdados da interface colletion com retrição especial
de não permitir elementos duplicados.

A interface Set é implementada pelas classes LinkedHashSet, HashSet e estendida pela interface SortedSet que
é implementada pela TreeSet.

## Represetação da Collection Interface




![image](https://user-images.githubusercontent.com/106537496/200079996-4a87a2e5-602d-4189-8f14-eeaae79edb12.png)
                       Fonte: WebDriver
                       
 ## Métodos importantes da interface Set
 
 * add(E e): Inserirá o elemento especificado no conjunto se não estiver disponível no conjunto.
 * addAll(Collection<? extends E> c): Adicionar todos os elementos da coleção no conjunto se ainda não estiverem presentes no conjuntos.
 * Clear(): Ele remove todos os elementos do conjunto.
 * contains(object o): Retornará true se todos os elementos estiverem disponível em set.
 * containsAll(Collection<?> c): Retorna true se todos os elementos de uma determinada coleção estiverem disponível em set.
 * equals(Object o): Comparará o objeto especificado com o conjunto para verificar a igualdade.
 * hashCode(): Retornará o valor do código hash para este conjunto.
 * isEmpty(): Retorna true se estiver vazio.
 * Iterator<E>iterator(): Retornará um iterator sobre os elemento em set.
 * remove(Object o): Ele removerá todos os elementos especificado do conjunto se estiver presente.
 * removeAll(Collection<?> c): Ele removerá todos os elementos do conjunto especificados na coleção.
 * size(): Retornará o tamanho de Set.
 
 

