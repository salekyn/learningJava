package prac4;

import java.util.Scanner;

public class main {
    static void main() throws IllegalTriangle {
        int x,y,z;
        Scanner input = new Scanner(System.in);

        System.out.println("input");
        x = input.nextInt();

        System.out.println("input");
        y = input.nextInt();

        System.out.println("input");
        z = input.nextInt();

        try {
            if (x + y < z) {
                throw new IllegalTriangle("x+y");
            } else if (x + z < y) {
                throw new IllegalTriangle("x+z");
            } else if (y + z < x) {
                throw new IllegalTriangle("y+z");
            } else {
                System.out.println("proper");
            }
        } catch (IllegalTriangle i) {
            System.out.println(i);
        }
    }
}
