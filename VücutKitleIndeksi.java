import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu girin:");
        double boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu girin:");
        double kilo = input.nextDouble();

        double vücutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: "  + vücutKitleIndeksi);
    }
}
