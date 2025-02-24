package coderbyte;


import java.util.*;


class Main23 {


    // solution 1:
    /*public static int Consecutive(int[] arr) {
        // code goes here

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        return (max-min+1)-arr.length;

    }*/



    // solution 2:
    /*public static int Consecutive(int[] arr) {

        Arrays.sort(arr);
        return arr[arr.length-1]-arr[0]+1-arr.length;
    }*/


    // solution 2:
    public static int Consecutive(int[] arr) {

        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        return sortedArr[sortedArr.length - 1] - sortedArr[0] + 1 - sortedArr.length;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Consecutive(new int[]{4, 8, 6}));
    }

}