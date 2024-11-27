import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int length = sc.nextInt();
            int spaces = length / 2;
            int asterisk = 1;
            while (asterisk <= length) {
                for (int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }

                for (int a = 0; a < asterisk; a++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                spaces -= 1;
                asterisk += 2;
            }
            spaces = length / 2;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            for (int i = 0; i < spaces - 1; i++) {
                System.out.print(" ");
            }
            System.out.println("***");
            System.out.print("\n");
        }

    }
}
