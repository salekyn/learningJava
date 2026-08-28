package prac4;

import java.util.Scanner;

public class p2 {
    static void main() throws Exception {
        int arr[] = new int[100];
        Scanner input = new Scanner(System.in);

        for(int i=0; i<100; i++){
            arr[i] = (int) (Math.random() * 10000);
        }

        while(true) {
            System.out.println("input");
            int x = input.nextInt();

            try {
                if (x > 99 || x < 0) {
                    throw new Exception();
                } else {
                    System.out.println(arr[x]);
                }
            } catch (Exception e) {
                System.out.println("wrong man, so wrong");
            }


        }
    }
}
