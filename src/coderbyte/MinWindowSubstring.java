package coderbyte;

public class MinWindowSubstring {


    public static String MinWindowSubstring(String[] strArr) {

        String n = strArr[0];
        String k = strArr[1];

        int minLength = Integer.MAX_VALUE;
        String shortestSubstring = "";

        for (int i = 0; i < n.length(); i++) {
            StringBuilder match = new StringBuilder(k);
            for (int j = i; j < n.length(); j++) {
                if (match.toString().contains(String.valueOf(n.charAt(j)))) {
                    int idx = match.indexOf(String.valueOf(n.charAt(j)));
                    match.replace(idx, idx + 1, "");
                }

                if (match.length() == 0) {
                    if (j - i < minLength) {
                        minLength = j - i;
                        shortestSubstring = n.substring(i, j + 1);
                    }
                    break;
                }
            }
        }
        return shortestSubstring;
    }




    public static void main(String[] args) {
        String[] strArr = {"aaabaaddae", "aed"};
        System.out.print(MinWindowSubstring(strArr));
    }















  /*  public static String MinWindowSubstring(String[] strArr) {

        String n = strArr[0];
        String k = strArr[1];

        int minLength = Integer.MAX_VALUE;
        String shortestSubstring = "";

        for (int i = 0; i < n.length(); i++) {
            StringBuilder match = new StringBuilder(k);
            for (int j = i; j < n.length(); j++) {
                if (match.toString().contains(String.valueOf(n.charAt(j)))) {
                    int idx = match.indexOf(String.valueOf(n.charAt(j)));
                    match.replace(idx, idx + 1, "");
                }

                if (match.length() == 0) {
                    if (j - i < minLength) {
                        minLength = j - i;
                        shortestSubstring = n.substring(i, j + 1);
                    }

                    break;
                }

            }

        }

        return shortestSubstring;
    }*/


   /* public static String MinWindowSubstring(String[] strArr) {
        String n = strArr[0];
        String k = strArr[1];

        int minLength = Integer.MAX_VALUE;
        String shortestSubstring = "";

        for (int i = 0; i < n.length(); i++) {
            StringBuilder match = new StringBuilder(k);

            for (int j = i; j < n.length(); j++) {
                if (match.toString().contains(String.valueOf(n.charAt(j)))) {
                    int idx = match.indexOf(String.valueOf(n.charAt(j)));
                    match.replace(idx, idx + 1, "");
                }

                if (match.length() == 0) {

                    if (j - i < minLength) {

                        minLength = j - i;
                        shortestSubstring = n.substring(i, j + 1);

                    }
                    break;

                }


            }

        }


        return shortestSubstring;
    }*/


}



        
        
        


