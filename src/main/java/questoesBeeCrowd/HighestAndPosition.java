package questoesBeeCrowd;

import java.util.Scanner;

public class HighestAndPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int bigger = number;
        int position = 1;
        for(int i = 2; i<=100; i++){
            number = sc.nextInt();
            if(number > bigger){
                bigger = number;
                position = i;
            }
        }
        System.out.println(bigger);
        System.out.println(position);
    }
}
