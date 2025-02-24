package coderbyte;

import java.util.*;


class Main21 {

    public static String ArrayAddition(int[] arr) {
        // code goes here
        int target = Arrays.stream(arr).sorted().toArray()[arr.length - 1];
        int[] newArr = Arrays.stream(arr).filter(n -> n != target).toArray();
        return ArrayAdditionHelper(newArr, 0, target) ? "true" : "false";

    }


    public static boolean ArrayAdditionHelper(int[] arr, int index, int target) {
        // code goes here
        if (target == 0) return true;
        if (index >= arr.length) return false;

        if (ArrayAdditionHelper(arr, index + 1, target - arr[index])) return true;

        if (ArrayAdditionHelper(arr, index + 1, target)) return true;

        return false;

    }


    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayAddition(new int[]{1, 2, 3, 4}));
    }

}