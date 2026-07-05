package prac1;
import java.util.Scanner;
public class p4 {
    static void main() {
        //adding two matrices

        int matrixOne [][] = new int[2][2];
        int matrixTwo [][] = new int [2][2];
        int matrixOutput [][] = new int [2][2];

        for (int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                matrixOne[i][j] = (int)(Math.random()*11);
                matrixTwo[i][j] = (int)(Math.random()*11);
            }
        }

        for (int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }



        for (int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                matrixOutput [i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        System.out.println();

        for (int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(matrixOutput[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
