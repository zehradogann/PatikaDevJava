import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sıcaklık;
        
        System.out.println("Hava kaç derece:");
        sıcaklık = input.nextDouble();
        if(sıcaklık<5){
            System.out.println("Kayak");
        }else if(sıcaklık>=5 && sıcaklık<=15){
            System.out.println("Sinema");
        }else if(sıcaklık>15 && sıcaklık <=25) {
            System.out.println("Piknik");
        }else{
            System.out.println("Yüzmw");
        }
    }
}
