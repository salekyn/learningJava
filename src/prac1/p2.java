package prac1;
import java.util.Scanner;

public class p2 {
    static void main() {
        //find all roots of a quadratic equation
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("a?");
            double a = input.nextDouble();

            System.out.println("b?");
            double b = input.nextDouble();

            System.out.println("c?");
            double c = input.nextDouble();

            double determinant = (b*b)-4*a*c;

            if ( determinant < 0 ) System.out.println("invalid");
            else {
                System.out.println( (-b + Math.sqrt(determinant))/2*a*c );
                System.out.println( (-b - Math.sqrt(determinant))/2*a*c );
            }
        }
    }
}
