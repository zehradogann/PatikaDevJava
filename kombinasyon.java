import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Lütfen bir sayı girin:");
        number=input.nextInt();
        System.out.println("Faktöriyeli:"+faktoriyel(number));
        System.out.println("Kombinasyonu alınacak sayıyı girin:");
        int num2=input.nextInt();
        System.out.println("Kombinasyonu:"+kombinasyon(number,num2));

    }
    static int faktoriyel(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }

    static int kombinasyon(int n,int r){
        int combination = faktoriyel(n) / (faktoriyel(r) * (faktoriyel(n-r)));
        return combination;
    }
}
