import java.util.Scanner;

public class TestingConditional {

    public static int testingSwitch(int month){
        return switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> 28;
        };
    }

    public static int testingIf(int month){
        if(month == 1 || month == 3 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }else return 28;
    }

    public static int testingTernary(int month){
        return (month == 1 || month == 3 || month == 7 || month == 8 || month == 10 || month == 12) ? 31 : (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 28;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type an integer value between 1 and 12");
        int month = sc.nextInt();

        System.out.println("Your month have " + testingSwitch(month) + " days");
        System.out.println("Your month have " + testingIf(month) + " days");
        System.out.println("Your month have " + testingTernary(month) + " days");
    }

}
