package coderbyte;

import java.util.*;

class Main14 {


    // solution 1:
    /*public static String TwoSum(int[] arr) {
        // code goes here


        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == arr[0]) map.put(arr[i], arr[j]);
            }
        }


        String result = "";
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            result = result + entry.getKey() + "," + entry.getValue() + " ";


        }

        if(result.isEmpty()) return "-1";
        return result.trim();

    }*/


    // solution 2:
    /*public static String TwoSum(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<String> pairs = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int complement = arr[0] - arr[i];
            if (seen.contains(complement)) {
                pairs.add(complement + "," + arr[i]);
            }
            seen.add(arr[i]);

        }

        if (pairs.isEmpty()) return "-1";
        return String.join(" ", pairs);
    }*/

    public static String TwoSum(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<String> pairs = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {

            int complement = arr[0] - arr[i];
            if (seen.contains(complement)) {
                pairs.add(complement + "," + arr[i]);
            }
            seen.add(arr[i]);

        }
        if (pairs.isEmpty()) return "-1";
        return String.join(" ", pairs);
    }




    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(TwoSum(new int[]{17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7}));
    }

}