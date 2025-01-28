package ExercicioStream;

import java.util.*;
import java.util.stream.*;

public class Exercicio73 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("maçã", "banana", "abacaxi", "uva", "kiwi");

        Map<Integer, List<String>> agrupadasPorTamanho = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupadasPorTamanho);
    }
}
