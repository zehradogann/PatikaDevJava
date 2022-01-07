import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("Lütfen dairenin yarıçapını girin:");
        int r = input.nextInt();
        System.out.println("Lütfen dairenin merkez açısını girin:");
        int a = input.nextInt();
        double alan = PI*r*r;
        double cevre = 2*PI*r;
        double dalan = (alan*a)/360;
        System.out.println("Dairenin alanı: " + alan + " çevresi: " + cevre + " daire dilim alanı: " + dalan);



    }
}
