package prac1;
import java.util.Scanner;
public class p1 {
    static void main() {
        // check if an alphabet is a vowel or a constant
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("input letter");
            String ch = input.next();


            switch (ch) {
                case "a":
                    System.out.println("vowel");
                    break;

                default:
                    System.out.println("not vowel");
            }
        }
    }
}
