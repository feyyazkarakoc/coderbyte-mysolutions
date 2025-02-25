package coderbyte;

public class CodelandUsernameValidation {

    public static void main(String[] args) {
        System.out.println(CodelandUsernameValidation("u__hello_world123"));

    }



    // Solution :
    /*public static String CodelandUsernameValidation(String str) {



        if (str.substring(0, 1).replaceAll("[^A-Za-z]", "").length() > 0) {
            if (str.length() > 3 && str.length() < 26) {
                if ( (str.replaceAll("[A-Za-z0-9_]", "").length() == 0)) {
                    if (!str.endsWith("_")) {
                        return "true";
                    }
                }
            }

        }

        return "false";
    }*/



    // Solution 2:
    /*public static String CodelandUsernameValidation(String str) {

        if(str.length()<4||str.length()>25) return "false";
        if(!Character.isLetter(str.charAt(0))) return "false";
        if(!str.matches("[a-zA-z0-9_]+")) return "false";
        if(str.endsWith("_"))return "false";
        return "true";
    }*/



    /*public static String CodelandUsernameValidation(String str) {
        if(str.length()<4||str.length()>25) return "false";
        if(!Character.isLetter(str.charAt(0))) return "false";
        if(!str.matches("[a-zA-Z0-9_]+")) return "false";
        if(str.charAt(str.length()-1)=='_') return "false";

        return "true";
    }*/







    public static String CodelandUsernameValidation(String str) {
        if(str.length()<4||str.length()>25) return "false";
        if(!Character.isLetter(str.charAt(0))) return "false";
        if(!str.matches("[A-Za-z0-9_]+")) return "false";
        if(str.endsWith("_")) return "false";
        return "true";
    }

}



