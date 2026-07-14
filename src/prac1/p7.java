package prac1;

import java.util.Scanner;

public class p7 {


    static double gpaFall2022(int noOfCourses, String[] grade){
        double totalCgpa = 0;
        double cgpa;
        for(int i=0; i<noOfCourses;i++){
            switch(grade[i]){
                case "A" : totalCgpa += 4.0; break;
                case "A-" : totalCgpa += 3.7; break;
                case "B+" : totalCgpa += 3.3; break;
                case "B"  : totalCgpa += 3.0; break;
                case "B-" : totalCgpa += 2.7; break;
                case "C+" : totalCgpa += 2.3; break;
                case "C"  : totalCgpa += 2.0; break;
                case "C-" : totalCgpa += 1.7; break;
                case "D+" : totalCgpa += 1.3; break;
                case "D"  : totalCgpa += 1.0; break;
                case "F"  :
                case "I"  :
                case "W"  : totalCgpa += 0.0; break;
                default:
                    System.out.println("Invalid grade entered: " + grade[i]);
                    break;
            }
        }
        cgpa = (totalCgpa/noOfCourses);
        return cgpa;

    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("write the number of courses:");
        int n = input.nextInt();

        String grade[] = new String[n];
        System.out.println("enter your grades");
        for(int i=0; i<n; i++){
            System.out.println("enter");
            grade[i] = input.next();
        }

        System.out.println( "your cgpa for fall 22 is " + gpaFall2022(n,grade));

    }
}
