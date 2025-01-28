package ExercicioStream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercicio6 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new Random().ints(1000, 0, 10000)
                .boxed()
                .collect(Collectors.toList());
        int maxNumber = randomNumbers.parallelStream()
                .max(Integer::compare)
                .get();
        System.out.println(maxNumber);
    }
}
