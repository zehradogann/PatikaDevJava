import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Lütfen bir sayı girin:");
        number=input.nextInt();
        for(int i = 1, k = 1; i<=number || k <=number; i *= 4,k *=5) {
            if(i != 1)
                System.out.println(i);
            System.out.println(k);
        }

    }
}
