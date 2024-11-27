package questoesBeeCrowd;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int firstFloor = sc.nextInt();
        int secondFloor = sc.nextInt();
        int thirdFloor = sc.nextInt();
        int calcEmployeesFirst = secondFloor*2 + thirdFloor*4;
        int calcEmployeesSecond = firstFloor*2 + thirdFloor*2;
        int calcEmployeesThird = firstFloor*4 + secondFloor*2;

        if(calcEmployeesFirst <=  calcEmployeesSecond && calcEmployeesFirst <= calcEmployeesThird){
            System.out.println(calcEmployeesFirst);
        }else if(calcEmployeesSecond <= calcEmployeesFirst && calcEmployeesSecond <= calcEmployeesThird){
            System.out.println(calcEmployeesSecond);
        }else System.out.println(calcEmployeesThird);
    }
}
