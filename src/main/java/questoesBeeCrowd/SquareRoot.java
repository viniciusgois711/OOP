package questoesBeeCrowd;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        double result = 0.5;

        for(int i = 1; i<times; i++){
            result = 1/(2+result);
        }
        if(times == 0){
            System.out.println("1.0000000000");
        }else{
            System.out.println(String.format("%.10f",1+result));
        }


    }
}
