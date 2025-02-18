package coderbyte;

import java.util.Scanner;

class Main1 {

    public static int FirstFactorial(int num) {
        // code goes here

        if(num==1) return 1;
        return num*FirstFactorial(num-1);

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }

}