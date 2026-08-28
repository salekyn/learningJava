//Write a program that takes 10 positive integers from user and prints the sum. If any negative
//
//value is entered, the program should catch it as an exception and display “Input positive
//
//integer only”. The program must continue taking input until it gets 10 positive integers.
package prac4;

import java.util.Scanner;

public class p1 {
    static void main()  {
        Scanner input = new Scanner(System.in);
        int sum=0, x, count=0;

        while(count<10) {
            System.out.println("input");
            x = input.nextInt();

            try{
            if(x>0){ sum+=x; count++;}
            else {
                throw new Exception();
            } }
            catch (Exception e) {
                System.out.println("pos pls");
            }
        }
    }
}
