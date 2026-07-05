package prac1;
import java.util.Scanner;
public class p3 {
    static void main() {
        //add up the factorial of a series
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 1;

        for (int i=2; i<=n; i++) {
            sum = sum * i;
        }

        System.out.println(sum);

    }
}
