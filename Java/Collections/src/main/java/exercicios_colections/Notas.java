package exercicios_colections;

import java.util.*;

public class Notas {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(5.7);
        notas.add(6.3);
        notas.add(9.4);
        notas.add(8.8);
        notas.add(3.3);
        notas.add(6.0);
        notas.add(7.0);
        System.out.println("Exibindo as notas: " + notas);
        System.out.println("Exibindo a posição da nota 6: " + notas.indexOf(6d));
        System.out.println("Adicionando a uma nota em uma determinada posição: ");
        notas.add(4,8.2);
        System.out.println(notas);
        System.out.println("Substituir um elemento: ");
        notas.set(notas.indexOf(6d), 10.0);
        System.out.println(notas);
        System.out.println("verificar se existe um elemento na lista: " + notas.contains(6.0));
        System.out.println("Menor nota: " + Collections.min(notas));
        System.out.println("Maior nota: " + Collections.max(notas));
        System.out.println("Exibir a soma das notas");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double n = iterator.next();
            soma += n;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + soma/ notas.size());
        System.out.println("Removendo a notas menores que 7");
        notas.removeIf(next -> next < 7);
        System.out.println(notas);
    }
}
