package prac1;

import java.util.Scanner;

public class p8 {
    static boolean isValidPassword(String password){

        if(password.length()<6) {
            return false;
        }

        int digitNo = 0;
        int letterNo = 0;
        char ch;

        for(int i=0; i<password.length(); i++) {
            ch = password.charAt(i);

            if(Character.isDigit(ch)) {
                digitNo++;
            }
            if(Character.isLetter(ch)){
                letterNo++;
            }

            if(!Character.isDigit(ch) && i == (password.length()-1)) {
                return false;
            }

        }

        if( letterNo<=0 || digitNo<=0 ) {
            return false;
        }

        return true;
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("input pass:");
        String pass = new String(input.next());

        System.out.println(isValidPassword(pass));
    }
}
