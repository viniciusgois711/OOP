import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(i + " x " + number + " = " + i*number);
        }
    }
}
