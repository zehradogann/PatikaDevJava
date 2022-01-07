import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first side of triangle:");
        double a = input.nextDouble();
        System.out.println("Please enter the second side of triangle:");
        double b = input.nextDouble();
        System.out.println("Please enter the third side of triangle:");
        double c = input.nextDouble();

        double u = (a+b+c)/2;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Perimeter of triangle: " + 2*u);
        System.out.println("Area of triangle: " + area);
    }
}
