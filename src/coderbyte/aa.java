package coderbyte;

import java.util.Scanner;

class Main20 {


    // solution :
    public static int NumberAddition(String str) {
        // code goes here
        int sum = 0;
        StringBuilder num = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                num.append(c); // Rakamları birleştir
            } else if (num.length() > 0) {
                sum += Integer.parseInt(num.toString()); // Sayıyı topla
                num.setLength(0); // Yeni sayılar için sıfırla
            }
        }
        if (num.length() > 0) { // Son sayıyı da ekleyelim
            sum += Integer.parseInt(num.toString());
        }

        return sum;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(NumberAddition(s.nextLine()));
    }

}