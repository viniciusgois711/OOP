package ListaHeranca.Figuras;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado;
        System.out.println("Digite o lado do quadrado: ");
        lado = sc.nextDouble();
        Quadrado q1 = new Quadrado(lado);
        System.out.println(q1.toString());
        System.out.println(q1.calcArea());
    }
}
