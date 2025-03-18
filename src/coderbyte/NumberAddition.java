package coderbyte;

import java.util.Scanner;

class NumberAddition {


    // solution 1 :
    /*public static int NumberAddition(String str) {
        // code goes here
        int sum = 0;
        StringBuilder num = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                num.append(c);
            } else if (num.length() > 0) {
                sum += Integer.parseInt(num.toString());
                num.setLength(0);
            }
        }
        if (num.length() > 0) {
            sum += Integer.parseInt(num.toString());
        }

        return sum;
    }*/


    /*public static int NumberAddition(String str) {

        int sum = 0;
        StringBuilder num = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else if (num.length() > 0) {
                sum += Integer.valueOf(num.toString());
                num.setLength(0);
            }
        }

        if (num.length() > 0) {
            sum += Integer.valueOf(num.toString());
        }

        return sum;
    }*/


    // solution 2 :
    /*public static int NumberAddition(String str) {
        int sum = 0;
        String[] arr = str.split("[\\D]+");
        for (String s : arr) {
            if (!s.isEmpty()) {
                sum += Integer.valueOf(s);
            }
        }

        return sum;
    }*/


    public static int NumberAddition(String str) {
        int sum = 0;
        String[] arr = str.split("[^\\d]+");
        for (String s : arr) {
            if (!s.isEmpty()) {
                sum += Integer.valueOf(s);
            }
        }
        return sum;
    }



    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(NumberAddition(s.nextLine()));
    }

}