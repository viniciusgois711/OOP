package ListaHeranca.Frete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FreteExpresso expresso = new FreteExpresso(100, 2000, 500);
        Frete normal = new Frete(100, 2000);

        System.out.println(normal.toString());
        System.out.println(expresso.toString());

        System.out.println("frete normal: " + normal.valorFrete());
        System.out.println("frete expresso: " + expresso.valorFrete());

    }
}
