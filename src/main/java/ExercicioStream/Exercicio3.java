package ExercicioStream;

import java.util.Arrays;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        int soma = numeros.stream().reduce(0, (a,b) -> a+b);
        System.out.println(soma);
    }
}
