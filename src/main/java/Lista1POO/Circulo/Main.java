//A classe deve ter um atributo raio para armazenar a dimensão da figura e métodos para calcular sua área e sua circunferência.
//Escrever um programa para testar a classe.
package Lista1POO.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int raio;
        Scanner sc = new Scanner(System.in);
        raio = sc.nextInt();
        Circulo circulo = new Circulo(raio);
        System.out.println(circulo.getRaio());
        System.out.println(circulo.area());
        System.out.println(circulo.circunferencia());

    }
}
