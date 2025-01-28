package ExercicioStream;

import java.util.Arrays;
import java.util.List;

public class Exercicio72 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(30, 55, 70, 40, 90, 10, 60, 100);

        double media = numeros.stream()
                .filter(n -> n > 50)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(media);
    }
}
