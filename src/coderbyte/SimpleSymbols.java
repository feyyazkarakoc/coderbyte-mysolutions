package coderbyte;

import java.util.Scanner;

class Main7 {

    public static String SimpleSymbols(String str) {
        // code goes here


        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (i == 0 || i == str.length() - 1 || str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
                    return "false";
                }
            }
        }

        return "true";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SimpleSymbols(s.nextLine()));
    }

}