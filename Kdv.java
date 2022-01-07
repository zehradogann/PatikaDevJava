import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the price of product:");
        double price = input.nextDouble();
        double kdv = (price<1000 && price>0) ? 0.18 : 0.08;
        price += price*kdv;
        System.out.println("KDV: " + kdv + " Price with KDV: " + price);
    }
}
