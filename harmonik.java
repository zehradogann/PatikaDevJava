import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Lütfen bir sayı girin:");
        number=input.nextInt();
        double result=0.0;
        for(double i=1;i<=number;i++){
            result+=(1/i);
        }
        System.out.println(result);
    }

}
