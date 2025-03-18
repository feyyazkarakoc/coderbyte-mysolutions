package coderbyte;

import java.util.*;

class NonrepeatingCharacter {


    // solutiion 1:
    /*public static String NonrepeatingCharacter(String str) {
        // code goes here

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) return entry.getKey() + "";
        }

        return "";


    }*/





    // solution 2:
   /* public static String NonrepeatingCharacter(String str) {

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) == 1) return String.valueOf(ch);
        }

        return "";
    }*/


    /*public static String NonrepeatingCharacter(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey()+"";
        }
        return "";

    }*/


    public static String NonrepeatingCharacter(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (countMap.get(ch) == 1) return String.valueOf(ch);
        }
        return "";
    }




    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(NonrepeatingCharacter(s.nextLine()));
    }

}