package coderbyte;

import java.util.Scanner;

class AdditivePersistence {


    // solution :
    public static int AdditivePersistence(int num) {
        // code goes here

        if(num<10) return 0;

        int count = 0;

        while(num>=10){
            int sum = 0;

            while(num>0){
                sum= sum+num%10;
                num=num/10;
            }
            num=sum;
            count++;
        }

        return count;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(AdditivePersistence(s.nextInt()));
    }

}