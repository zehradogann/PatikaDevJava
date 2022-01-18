import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total=1;
        System.out.println("Lütfen bir sayı girin:");
        number=input.nextInt();
        System.out.println("Lütfen sayının üssünü girin:");
        int num2=input.nextInt();
        for(int i=1;i<=num2;i++){
            total*=number;
        }
        System.out.println(number+" üssü "+num2+" eşittir: "+total);

    }

}
