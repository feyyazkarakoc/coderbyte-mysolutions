package coderbyte;

public class P_CodelandUsernameValidation {

    public static String CodelandUsernameValidation(String str) {



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
    }

    public static void main(String[] args) {
        System.out.println(CodelandUsernameValidation("u__hello_world123"));

    }
}
