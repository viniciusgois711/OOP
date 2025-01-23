
package ExercicioStream;

import java.util.Arrays;  // Importa a classe Arrays
import java.util.List;    // Importa a interface List

public class Exercicio1 {
    public static void main(String[] args) {
       List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numeros.stream().filter(n -> n%2 == 0).forEach(System.out::println);

    }
}
