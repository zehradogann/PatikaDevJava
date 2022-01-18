import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı girin");
        int n1=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı girin");
        int n2=input.nextInt();
        int ebob=1, ekok;
        int i=1;
        while(i <= n1 && i <= n2){
            ++i;
            if(n1 % i == 0 && n2 % i == 0)
                ebob = i;
        }
        ekok = (n1 * n2) / ebob;
        System.out.printf(" %d ve  %d sayılarının EBOB'u %d \n", n1, n2, ebob);
        System.out.printf(" %d ve  %d sayılarının EKOK'u %d \n", n1, n2, ekok);
    }
}
