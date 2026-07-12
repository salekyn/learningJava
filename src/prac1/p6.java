package prac1;

import java.util.Scanner;

public class p6 {
    static void main() {
        Scanner input = new Scanner(System.in);

        int arr[][] = new int[5][5];

        int majorSum = 0;
        int minorSum = 0;

        for(int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.println("input");
                arr[i][j] = input.nextInt();

                if(i==j) {
                    majorSum+= arr[i][j];
                }
            }
        }

        for (int i = 0, j = 4; i < 5 && j >= 0; i++, j--) {
            minorSum += arr[i][j];
        }

        System.out.println("sum of major diagonal: " + majorSum);
        System.out.println("sum of minor diagonal: " + minorSum);

    }
}
