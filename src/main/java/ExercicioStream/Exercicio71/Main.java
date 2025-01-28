package ExercicioStream.Exercicio71;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 20),
                new Pessoa("Carlos", 17),
                new Pessoa("Beatriz", 22),
                new Pessoa("João", 16),
                new Pessoa("Maria", 19)
        );

        List<String> nomes = pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .map(Pessoa::getNome)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(nomes);

    }
}
