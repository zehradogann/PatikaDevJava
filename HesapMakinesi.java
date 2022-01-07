import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen işlem yapacağınız ilk sayıyı giriniz:");
        int num1 = input.nextInt();
        System.out.println("Lütfen işlem yapacağınız ikinci sayıyı giriniz:");
        int num2 = input.nextInt();
        double sonuc;
        System.out.print("1-->Toplama\n2-->Çıkartma\n3-->Çarpma\n4-->Bölme\n");
        System.out.println("Lütfen yapmak istediğiniz işlemi aşağıdaki menüden seçin:");
        int secim = input.nextInt();
        switch (secim){
            case 1:
                sonuc = num1 + num2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = num1 - num2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = num1 * num2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc = num1 / num2;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("Lütfen bir seçenek seçin");
                break;
        }
    }
}
