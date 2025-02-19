package coderbyte;

import java.util.Scanner;

class Main5 {

    public static int SimpleAdding(int num) {
        // code goes here

        return (num*(num+1))/2;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SimpleAdding(s.nextInt()));
    }

}