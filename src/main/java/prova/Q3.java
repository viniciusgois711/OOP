package prova;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vezes = sc.nextInt();
        sc.nextLine();
        for (int z = 0; z <= vezes; z++) {
            String nome = sc.nextLine();
            int deslocar = sc.nextInt();
            sc.nextLine();



            String resultado = "";
            for (int i = 0; i < nome.length(); i++) {
                char letra = nome.charAt(i);
                int x = letra;
                for (int a = 0; a < deslocar; a++) {
                    if (x == 90) {
                        x = 64;
                    }
                    x++;
                }
                resultado += (char) (x);

            }
            System.out.println(resultado);
        }
    }
}