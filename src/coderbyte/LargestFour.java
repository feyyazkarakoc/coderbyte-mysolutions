package coderbyte;

import java.util.Arrays;
import java.util.Scanner;

class LargestFour {


    // solution :
    /*public static int LargestFour(int[] arr) {
        // code goes here
        if (arr.length <= 4) return Arrays.stream(arr).sum();

        Arrays.sort(arr);
        return arr[arr.length - 1] + arr[arr.length - 2] + arr[arr.length - 3] + arr[arr.length - 4];

    }*/


    public static int LargestFour(int[] arr) {
        if(arr.length<=4) return Arrays.stream(arr).sum();

        Arrays.sort(arr);
        return arr[arr.length-1]+
               arr[arr.length-2]+
               arr[arr.length-3]+
               arr[arr.length-4];

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LargestFour(new int[]{1, 1, 1, -5}));
    }

}