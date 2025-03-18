package coderbyte;

import java.util.Arrays;
import java.util.Scanner;

class ArrayAdditionI {


    // solution  :
    /*public static String ArrayAdditionI(int[] arr) {
        // code goes here
        int target = Arrays.stream(arr).sorted().toArray()[arr.length - 1];

        int[] newArr = Arrays.stream(arr).filter(n -> n != target).toArray();

        return ArrayAdditionIHelper(newArr, 0, target) ? "true" : "false";
    }

    public static boolean ArrayAdditionIHelper(int[] arr, int index, int target) {
        if (target == 0) return true;
        if (index >= arr.length) return false;

        if (ArrayAdditionIHelper(arr, index + 1, target - arr[index])) return true;
        if (ArrayAdditionIHelper(arr, index + 1, target)) return true;

        return false;
    }*/


   public static String ArrayAdditionI(int[] arr) {

        int target = Arrays.stream(arr).sorted().toArray()[arr.length - 1];
        int[] newArr = Arrays.stream(arr).filter(n -> n != target).toArray();

        return ArrayAdditionIHelper(newArr, 0, target) ? "true" : "false";
    }

    public static boolean ArrayAdditionIHelper(int[] arr, int index, int target) {

        if (target == 0) return true;
        if (index >= arr.length) return false;

        if (ArrayAdditionIHelper(arr, index + 1, target - arr[index])) return true;
        return ArrayAdditionIHelper(arr, index + 1, target);
    }




 public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayAdditionI(new int[]{3, 5, -1, 8, 12}));
    }

}




