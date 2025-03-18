package coderbyte;

import java.util.Scanner;

class VowelCount {

    // solution 1:
    /*public static int VowelCount(String str) {
        // code goes here

        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }*/


    // solution 2:
    public static int VowelCount(String str) {
        // code goes here

        return (int) str.toLowerCase().chars().filter(ch -> isVowel(ch)).count();
    }

    public static boolean isVowel(int ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(VowelCount(s.nextLine()));
    }

}


