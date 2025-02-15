package coderbyte;

public class P_CodelandUsernameValidation {

    public static void main(String[] args) {
        System.out.println(CodelandUsernameValidation("u__hello_world123"));

    }



    // Solution 1:
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
    public static String CodelandUsernameValidation(String str) {

        if(str.endsWith("-")||(str.length()<4||str.length()>25)||str.substring(0,1).replaceAll("[^^A-Za-z]","").length()==1||str.replaceAll("[^A-Za-z0-9_]","").length()==0){
            return "false";
        }

        return "true";
    }

}
