package coderbyte;

import java.util.Scanner;

public class ABCheck {

    public static String ABCheck(String str) {
        // code goes here
        for (int i = 0; i < str.length(); i++) {
            str = str.toLowerCase();
            if (i + 4 < str.length() && str.charAt(i) == 'a' && str.charAt(i + 4) == 'b'
                    && !str.substring(i + 1, i + 4).contains("b")) {
                return "true";
            }

            if (i + 4 < str.length() && str.charAt(i) == 'b' && str.charAt(i + 4) == 'a'
                    && !str.substring(i + 1, i + 4).contains("a")) {
                return "true";
            }


        }
        return "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ABCheck(s.nextLine()));
    }
}




