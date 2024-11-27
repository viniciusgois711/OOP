import java.util.Scanner;

public class Fliper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pDoor = sc.nextInt();
        int rDoor = sc.nextInt();
        String result;
        if (pDoor == 0){
            result = "C";
        }else if(pDoor == 1 && rDoor == 0){
            result = "B";
        }else result = "A";
        System.out.println(result);
    }
}
