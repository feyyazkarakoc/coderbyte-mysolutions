package coderbyte;

import java.util.Scanner;

class Main15 {

    public static String CheckNums(int num1, int num2) {
        // code goes here
        if(num2>num1) {
            return "true";
        } else if (num2==num1) {
            return "-1";
        }else{
            return "false";
        }

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CheckNums(3,122));
    }

}