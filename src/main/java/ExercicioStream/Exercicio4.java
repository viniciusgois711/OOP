package ExercicioStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio4 {
    public static void main(String[] args) {
        
        List<String> nomes = Arrays.asList("nomeTeste1", "nomeTest2", "nomeTeste3");

        String nomesConcatenados = nomes.stream().collect(Collectors.joining(","));

        System.out.println(nomesConcatenados);
    }   
}
