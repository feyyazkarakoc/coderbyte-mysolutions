package coderbyte;


import java.util.Scanner;

class Main22 {


    // solution :
    /*public static String FormattedDivision(int num1, int num2) {
        // code goes here
        return String.format("%,.4f",(double)num1/num2);
    }*/



    public static String FormattedDivision(int num1, int num2) {
        return String.format("%,.4f",(double)num1/num2);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FormattedDivision(10,10));
    }

}