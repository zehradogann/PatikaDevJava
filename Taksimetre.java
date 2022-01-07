import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç km yol gittiniz:");
        double km = input.nextDouble();
        double price = ((km * 2.20+10)>=20) ? (km * 2.20)+10 : 20;
        System.out.println("Toplam borcunuz: " + price);
    }
}
