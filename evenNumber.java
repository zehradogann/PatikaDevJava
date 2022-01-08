import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin:");
        int sayı=input.nextInt();
        int sum=0,count=0;
        for (int i = 1; i < sayı; i++) {
            if(i%3==0 && i%4==0){
                sum+=i;
                count++;
            }
        }
        System.out.println("3 ve 4 e bölünen " + count + " adet sayının toplamı: " + sum + " ortalaması: " + sum/count);
    }
}
