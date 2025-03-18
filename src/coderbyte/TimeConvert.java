package coderbyte;

import java.util.Scanner;

class TimeConvert {

    public static String TimeConvert(int num) {
        // code goes here
        int hour = num / 60;
        int minute = num % 60;
        return hour + ":" + minute;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(TimeConvert(s.nextInt()));
    }

}