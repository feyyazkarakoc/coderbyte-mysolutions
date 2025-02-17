package coderbyte;

import java.util.Scanner;

public class LongestWord {


    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }


    // solution 1:
    /*public static String LongestWord(String sen) {
        // code goes here


        int maxLen = 0;
        String maxLenWord="";
        String[] words = sen.replaceAll("\\p{Punct}","").split("\\s+");
        for(String str :words){
            if(str.length() > maxLen){
                maxLen=str.length();
                maxLenWord = str;
            }
        }

        return maxLenWord;
    }*/



    // solution 2:

    public static String LongestWord(String sen) {
       int maxLen = 0;
       String maxLenWord = "";
       String[] words = sen.replaceAll("[^A-Za-z0-9\\s]","").split("\\s+");
       for(String str : words){
           if(str.length()>maxLen){
               maxLen = str.length();
               maxLenWord=str;
           }
       }
       return maxLenWord;
    }


}
