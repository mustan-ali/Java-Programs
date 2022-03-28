import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        double a = input.nextDouble();

        System.out.print("Enter B: ");
        double b = input.nextDouble();

        System.out.print("Enter C: ");
        double c = input.nextDouble();

        double result = Math.pow(b, 2) - 4 * a * c;

        if (result < 0) {
            System.out.println("No real roots");
        } 
        else if (result == 0) {
            double root = -b / (2 * a);
            System.out.println("Root = " + root);
        } 
        else {
            double root1 = (-b + Math.sqrt(result)) / (2 * a);
            double root2 = (-b - Math.sqrt(result)) / (2 * a);
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
    }
}
