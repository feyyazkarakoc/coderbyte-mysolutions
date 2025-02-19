package coderbyte;

import java.util.Scanner;

class Main6 {


    // solution 1:
   /* public static String LetterCapitalize(String str) {
        // code goes here
        String[] arr= str.split(" ");
        for(int i = 0; i< arr.length;i++){
            if(!arr[i].isEmpty()){
                arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
            }

        }
        return String.join(" ",arr);
    }*/




    // solution 2:
    public static String LetterCapitalize(String str) {

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for(char ch : str.trim().toCharArray()){
            if (Character.isLetter(ch)&&capitalizeNext){
                result.append(Character.toUpperCase(ch));
                capitalizeNext=false;
            }else {
                result.append(ch);

            }

            if(ch==' '){
                capitalizeNext=true;
            }
        }

        return result.toString();

    }



    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }

}