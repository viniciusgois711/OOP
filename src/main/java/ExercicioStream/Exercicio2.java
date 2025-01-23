package ExercicioStream;

import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("teste", "cadeira", "mesa", "garrafa");
        palavras.stream()
        .filter(palavra -> palavra.length() > 5 )
        .map(palavra -> palavra.toUpperCase()).
        forEach(System.out::println); 
        

    }
}
