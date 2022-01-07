import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER YOUR MATH GRADE:");
        double m = input.nextDouble();

        System.out.println("PLEASE ENTER YOUR PHYSICS GRADE:");
        double p = input.nextDouble();

        System.out.println("PLEASE ENTER YOUR CHEMICAL GRADE:");
        double c = input.nextDouble();

        System.out.println("PLEASE ENTER YOUR TURKISH GRADE:");
        double t = input.nextDouble();

        System.out.println("PLEASE ENTER YOUR HISTORY GRADE:");
        double h = input.nextDouble();

        System.out.println("PLEASE ENTER YOUR MUSIC GRADE:");
        double music = input.nextDouble();

        double[] arr = {m,p,c,t,h,music};
        double sum=0.0;
        int count =0;
        for(double eleman : arr){
            if(eleman>0 && eleman<100){
                sum+=eleman;
                count++;
            }
        }
        double average = sum / count;
        System.out.println("YOUR AVERAGE GRADE İS: " + average);
        System.out.println(average > 55 ? "PASS" : "FAIL");
    }
}
