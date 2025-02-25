package coderbyte;


import java.util.Scanner;

class Main3 {


    // solution:
    /*public static String SerialNumber(String str) {
        // code goes here

        String[] parts = str.split("\\.");
        if (parts.length != 3) return "false";

        for (String part : parts) {
            if (!part.matches("[1-9]{3}")) return "false";
        }


        int[] sum = new int[3];
        for (int i = 0; i < 3; i++) {

            sum[i] = parts[i].charAt(0) - '0' + parts[i].charAt(1) - '0' + parts[i].charAt(2)-'0';
            if (parts[i].charAt(2) <= parts[i].charAt(0) || parts[i].charAt(2) <= parts[i].charAt(1)) return "false";

        }


        if (!(sum[0] % 2 == 0)) return "false";

        if (!(sum[1] % 2 == 1)) return "false";


        return "true";


    }*/



    // solution:
    /*public static String SerialNumber(String str) {

        String[] parts = str.split("\\.");
        for(String part : parts){
            if(!(part.matches("[1-9]{3}"))) return "false";
        }

        int[] sum = new int[3];
        for(int i=0; i<3;i++){
            sum[i]=parts[i].charAt(0)-'0'+parts[i].charAt(1)-'0'+parts[i].charAt(2)-'0';
            if(parts[i].charAt(2)<parts[i].charAt(1)||parts[i].charAt(2)<parts[i].charAt(0)) return "false";
        }

        if(!(sum[0]%2==0)) return "false";
        if(!(sum[1]%2==1)) return "false";

        return "true";
    }*/


    public static String SerialNumber(String str) {

        String[] parts = str.split("\\.");

        if (parts.length != 3) return "false";

        for (String part : parts) {

            if (!part.matches("[1-9]{3}")) return "false";
        }

        int[] sum = new int[3];

        for (int i = 0; i < 3; i++) {
            sum[i] = parts[i].charAt(0) - '0' + parts[i].charAt(1) - '0' + parts[i].charAt(2) - '0';
            if (!(parts[i].charAt(2) > parts[i].charAt(0) && parts[i].charAt(2) > parts[i].charAt(1))) return "false";
        }

        if (sum[0] % 2 != 0) return "false";
        if (sum[1] % 2 != 1) return "false";

        return "true";

    }


    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SerialNumber(s.nextLine()));
    }

}