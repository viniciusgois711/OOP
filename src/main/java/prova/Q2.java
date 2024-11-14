package prova;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vezes = sc.nextInt();
        for(int i = 1; i<=vezes; i++) {
            int num = sc.nextInt();
            int soma = 0;
            for (int x = 1; x < num; x++) {
                if (num % x == 0) {
                    soma += x;
                }
            }
            if (soma == num) {
                System.out.println(num + " eh perfeito");
            } else {
                System.out.println(num + " nao eh perfeito");
            }
        }
    }
}
