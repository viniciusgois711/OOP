package ExercicioStream;

import java.util.stream.IntStream;

public class Exercicio5 {
    public static void main(String[] args) {
        IntStream.range(0, 10)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
