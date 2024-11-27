package questoesBeeCrowd;

import java.util.Scanner;

public class ScoreValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float score1 = -100000;
        float score2 = -100000;
        while(score1 == -100000){
            score1 = sc.nextFloat();
            if(score1<0 || score1>10){
                score1 = -100000;
                System.out.println("nota invalida");
            }
        }
        while(score2 == -100000){
            score2 = sc.nextFloat();
            if(score2<0 || score2>10){
                score2 = -100000;
                System.out.println("nota invalida");
            }
        }
        System.out.println("media = " + (score1+score2)/2);
    }
}
