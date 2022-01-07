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

        double sum = (m+p+c+t+h+music);
        double average = sum / 6.0;
        System.out.println("YOUR AVERAGE GRADE İS: " + average);
        System.out.println(average > 60 ? "PASS" : "FAIL");
    }
}
