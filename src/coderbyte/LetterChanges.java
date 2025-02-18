package coderbyte;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main2 {


    // solution :
    /*public static String LetterChanges(String str) {
        // code goes here
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char nextChar = (c == 'z') ? 'a' : (c == 'Z') ? 'A' : (char) (c + 1);
                sb.append("aeiou".indexOf(nextChar) != -1 ? Character.toUpperCase(nextChar) : nextChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }*/



    /*public static String LetterChanges(String str) {

        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if (Character.isLetter(ch)){
                char nextChar =  ch=='Z'? 'A' :ch=='z'?'a': (char)(ch+1);
                sb.append("aeiou".indexOf(nextChar)!=-1?Character.toUpperCase(nextChar):nextChar);
            }else{
                sb.append(ch);
            }

        }
        return sb.toString();
    }*/

    public static String LetterChanges(String str) {
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
               char nextChar = ch=='Z'?'A' :ch=='z'?'a': (char)(ch+1);
               sb.append("aeiou".indexOf(nextChar)==-1?nextChar:Character.toUpperCase(nextChar));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }










    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }

}