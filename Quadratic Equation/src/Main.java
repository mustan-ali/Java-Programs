import java.util.Scanner;

public class Main {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4.0 * a * c;

        if (discriminant > 0.0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } 
        else if (discriminant == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } 
        else {
            System.out.println("Roots are not real.");
        }
    }
}