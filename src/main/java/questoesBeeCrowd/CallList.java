import java.util.Arrays;
import java.util.Scanner;

public class CallList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amountNames = sc.nextInt();
        int position = sc.nextInt();
        String[] nomes = new String[amountNames+1];

        for(int i = 0; i<=amountNames; i++){
            nomes[i] = sc.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println(nomes[position]);
    }
}