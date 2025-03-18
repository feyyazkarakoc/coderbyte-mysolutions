package coderbyte;

import java.util.Scanner;

class ExOh {

    public static String ExOh(String str) {
        // code goes here
        str = str.toLowerCase();
        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                xCount++;
            } else if (str.charAt(i) == 'o') {
                oCount++;
            }
        }
        return xCount == oCount ? "true" : "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ExOh(s.nextLine()));
    }

}