package coderbyte;

public class P_FirstReverse {


    public static void main(String[] args) {
        System.out.println(FirstReverse("Coderbyte"));
    }

    public static String FirstReverse(String str) {

        String reversedStr = "";
        String[] strArr = str.split("");
        for (int i = strArr.length-1; i > -1 ; i--) {
            reversedStr = reversedStr +strArr[i];


        }
        return reversedStr;

    }





}
