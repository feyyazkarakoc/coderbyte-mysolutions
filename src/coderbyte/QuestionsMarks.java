package coderbyte;

import java.util.Scanner;

class QuestionsMarks {


    // solution:
    public static String QuestionsMarks(String str) {
        // code goes here

        int prevNum = -1;
        int qCount = 0;
        boolean found = false;

        for (char ch : str.toCharArray()) {

            if (Character.isDigit(ch)) {
                int num = ch - '0';
                if (prevNum != -1 && prevNum + num == 10) {
                    if (qCount != 3) return "false";
                    found = true;
                }
                prevNum = num;
                qCount = 0;

            } else if (ch == '?') {
                qCount++;
            }

        }
        return found ? "true" : "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }

}