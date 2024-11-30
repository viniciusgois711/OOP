package Lista1POO.Equation;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the A value");
        a = sc.nextDouble();
        System.out.println("Type the B value");
        b = sc.nextDouble();
        System.out.println("Type the C value");
        c = sc.nextDouble();

        Equation equation = new Equation(a, b, c);

        System.out.println(equation.toString());
        System.out.println(Arrays.toString(equation.rootsMethod()));
    }
}
