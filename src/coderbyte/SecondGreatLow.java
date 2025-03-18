package coderbyte;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class SecondGreatLow {


    // solution 1:
    /*public static String SecondGreatLow(int[] arr) {
        // code goes here

        Arrays.sort(arr);
        if (arr.length == 2) return arr[1] + " " + arr[0];

        Set<Integer> uniqueNum = new HashSet<>();
        for (int num : arr) {
            uniqueNum.add(num);
        }

        Integer[] uniquearr = uniqueNum.toArray(new Integer[uniqueNum.size()]);

        Arrays.sort(uniquearr);

        return uniquearr[1] + " " + uniquearr[uniquearr.length - 2];


    }*/



     /* public static String SecondGreatLow(int[] arr) {

        Arrays.sort(arr);
        if(arr.length==2) return arr[0]+ " "+ arr[1];

        Set<Integer> uniqueNum = new HashSet<>();
        for (int num:arr){
            uniqueNum.add(num);
        }

        Integer[] uniqueArr = uniqueNum.toArray(new Integer[uniqueNum.size()]);
        Arrays.sort(uniqueArr);

        return uniqueArr[1]+" "+uniqueArr[uniqueArr.length-2];
    }*/



// solution 2:
    /*public static String SecondGreatLow(int[] arr) {

        int[] uniqueSorted = Arrays.stream(arr).distinct().sorted().toArray();

        if(uniqueSorted.length==2) return uniqueSorted[0]+" "+uniqueSorted[1];
        return uniqueSorted[1]+" "+uniqueSorted[uniqueSorted.length-2];
    }*/



    public static String SecondGreatLow(int[] arr) {
        int[] uniqueSorted = Arrays.stream(arr).distinct().sorted().toArray();
        if(uniqueSorted.length==2) return uniqueSorted[0]+" "+uniqueSorted[1];
        return uniqueSorted[1]+" "+uniqueSorted[uniqueSorted.length-2];
    }




    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SecondGreatLow(new int[] {1, 42, 42, 180}));
    }



}