package questoesBeeCrowd;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int c = sc.nextInt();

        if(l%2 != 0 && c%2 != 0 || l%2 == 0 && c%2 == 0){
            System.out.println("1");
        }else if(l%2 != 0 && c%2 == 0 || l%2 == 0 && c%2 !=0){
            System.out.println("0");
        }
    }
}
