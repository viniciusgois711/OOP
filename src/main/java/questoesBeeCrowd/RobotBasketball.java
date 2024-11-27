import java.util.Scanner;

public class RobotBasketball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();

        if(distance<=800){
            System.out.println("1");
        }else if(distance > 800 && distance <= 1400){
            System.out.println("2");
        }else System.out.println("3");

    }
}
