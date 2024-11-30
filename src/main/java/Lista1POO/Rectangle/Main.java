package Lista1POO.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the rectangle base");
        base = sc.nextDouble();
        System.out.println("Type the rectangle height");
        height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(base, height);
        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.diagonal());
        System.out.println(rectangle.toString());

    }
}
