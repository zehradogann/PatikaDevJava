import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç kilo armut aldınız:");
        double armut = input.nextDouble();
        System.out.println("Kaç kilo elma aldınız:");
        double elma = input.nextDouble();
        System.out.println("Kaç kilo domates aldınız:");
        double domates = input.nextDouble();
        System.out.println("Kaç kilo muz aldınız:");
        double muz = input.nextDouble();
        System.out.println("Kaç kilo patlıcan aldınız:");
        double patlıcan = input.nextDouble();
        double totalPrice = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlıcan*5);
        System.out.println("Toplam tutar: "  + totalPrice);
    }
}
