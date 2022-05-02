package exercicios_colections;

import java.util.*;

public class NotasSet {
    public static void main(String[] args) {
        System.out.println("Crinado um conjunto de notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(5.4,2.2,7.8,4.4));
        System.out.println("Exibir o conjunto: " + notas);
        System.out.println("Verificar se existe a nota no conjunto: " + notas.contains(5.0));
        System.out.println("Menor nota: " + Collections.min(notas));
        System.out.println("Maior nota: " + Collections.max(notas));
        System.out.println("Soma das notas");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + soma/ notas.size());
        System.out.println("Remover as notas maiores que 5");
        notas.removeIf(next -> next > 5);
        System.out.println(notas);

        //Utilizando LinkedSet
        System.out.println("Exibindo os valores na ordem que foram inseridos");
        Set<Double> nota2 = new LinkedHashSet<>();
        nota2.add(5.2);
        nota2.add(3.2);
        nota2.add(7.1);
        nota2.add(9.6);
        nota2.add(4.7);
        System.out.println(nota2);
        System.out.println("Exibindo os valores em ordem crescente");
        Set<Double> notas3 = new TreeSet<>(nota2);
        System.out.println(notas3);
    }
}
