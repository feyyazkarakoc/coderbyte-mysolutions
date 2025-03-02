package coderbyte;

import java.util.Scanner;

class Main25 {


    // solution:
    public static String PalindromeTwo(String str) {
        // code goes here
        str = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        String reversedStr = (new StringBuilder(str).reverse()).toString();
        return str.equals(reversedStr) ? "true" : "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PalindromeTwo(s.nextLine()));
    }

}


