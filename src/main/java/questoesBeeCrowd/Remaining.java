import java.util.Scanner;

public class Remaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int x = number+2;
        System.out.println("2");
        while(x<=10000){
            System.out.println(x);
            x+=number;
        }
    }
}
