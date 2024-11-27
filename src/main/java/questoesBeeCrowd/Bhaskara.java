import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if(delta>0 && a !=0){
            double bhaskara1 = (b*(-1) + Math.sqrt(delta))/(2*a);
            double bhaskara2 = (b*(-1) - Math.sqrt(delta))/(2*a);
            System.out.println(String.format("R1 = %.5f", bhaskara1));
            System.out.println(String.format("R2 = %.5f", bhaskara2));
        }else{
            System.out.println("Impossivel calcular");
        }
    }
}

