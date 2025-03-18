package coderbyte;

import java.util.*;

class OverlappingRanges {


    // solution :
    /*public static String OverlappingRanges(int[] arr) {
        // code goes here

        int firstStart = arr[0];
        int firstEnd = arr[1];
        int secondStart = arr[2];
        int secondEnd = arr[3];

        int intersectStart = Math.max(firstStart, secondStart);
        int intersectEnd = Math.min(firstEnd, secondEnd);

        if (intersectStart > intersectEnd) return "false";

        int overlapcount = intersectEnd - intersectStart + 1;

        return overlapcount >= arr[4] ? "true" : "false";

    }*/





    public static String OverlappingRanges(int[] arr) {
        int firstStart = arr[0];
        int firstEnd = arr[1];
        int secondStart = arr[2];
        int secondEnd = arr[3];

        int intersectStart = Math.max(firstStart,secondStart);
        int intersectEnd = Math.min(firstEnd,secondEnd);

        if (intersectStart>intersectEnd) return "false";

        int overlapCount = intersectEnd-intersectStart+1;

        return overlapCount>=arr[4]?"true":"false";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(OverlappingRanges(new int[]{1, 8, 2, 4, 4}));
    }

}