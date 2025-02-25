package coderbyte;

public class FirstReverse {


    public static void main(String[] args) {
        System.out.println(FirstReverse("Coderbyte"));
    }




    // solution 1:
    /*public static String FirstReverse(String str) {

        String reversedStr = "";
        String[] strArr = str.split("");
        for (int i = strArr.length-1; i > -1 ; i--) {
            reversedStr = reversedStr +strArr[i];


        }
        return reversedStr;

    }*/



    // solution 2 :

    /*public static String FirstReverse(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            sb.append("").append(str.charAt(i));
        }

        return sb.toString();
    }*/


    // solution 3 :
    /*public static String FirstReverse(String str) {

        String[] strArr = str.split("");
        String reversedStr = "";
        for(int i = strArr.length-1; i>=0;i--){
            reversedStr+=strArr[i];
        }
        return reversedStr;

    }*/



    // solution 4 :
    /*public static String FirstReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }*/





    /*public static String FirstReverse(String str) {

        String reversedStr="";
        for(int i = str.length()-1; i>=0;i--){
            reversedStr+=str.charAt(i)+"";
        }
        return reversedStr;
    }*/



    /*public static String FirstReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }*/


    public static String FirstReverse(String str) {
       return new StringBuilder(str).reverse().toString();
    }






}
