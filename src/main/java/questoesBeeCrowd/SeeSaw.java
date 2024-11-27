package questoesBeeCrowd;

import java.util.Scanner;

public class SeeSaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int child1, length1, child2, length2, side1, side2;
        child1 = sc.nextInt();
        length1 = sc.nextInt();
        child2 = sc.nextInt();
        length2 = sc.nextInt();
        side1 = child1*length1;
        side2 = child2*length2;
        if(side1 == side2){
            System.out.println(0);
        }else if(side2>side1){
            System.out.println(1);
        }else System.out.println(-1);
    }
}
