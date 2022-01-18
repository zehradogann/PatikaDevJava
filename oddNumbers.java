import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayı;
        int sum=0;
        do{
            System.out.println("Sayı giriniz:");
            sayı= input.nextInt();
            if(sayı%2==0 && sayı%4==0){
                sum+=sayı;
            }
        }while(sayı%2==0);
        System.out.println("Sum is:" + sum);

    }
}
