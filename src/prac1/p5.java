package prac1;

import java.util.Scanner;

public class p5 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of elements in the array:");
        int n = input.nextInt();

        int arr[] = new int [n];

        System.out.println("enter all 8 elements:");
        for(int i =0; i<n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("what is ur target?");
        int target = input.nextInt();

        int count=0;
        for(int i=0; i<n; i++) {
             if (arr[i] == target) count++;
        }

        System.out.println("the target " + target + " appeared " + count + " times ");
    }

}
