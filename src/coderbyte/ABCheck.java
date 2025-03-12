package coderbyte;

import java.util.Scanner;

class Main19 {

    public static String ABCheck(String str) {
        // code goes here
        for(int i =0; i<str.length(); i++){
            str=str.toLowerCase();
            if(i+4<str.length() &&str.charAt(i)=='a'&&str.charAt(i+4)=='b'
                    &&!str.substring(i+1,i+4).contains("b")){
                return "true";
            }

            if(i+4<str.length() &&str.charAt(i)=='b'&&str.charAt(i+4)=='a'
                    &&!str.substring(i+1,i+4).contains("a")){
                return "true";
            }


        }
        return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ABCheck(s.nextLine()));
    }

}


/*Bu fonksiyon, verilen str içinde belirli bir deseni kontrol eder:

Tüm harfleri küçük harfe çevirir (ancak döngü içinde tekrar tekrar yapılıyor, bu gereksiz).
Döngüyle tüm karakterleri tek tek kontrol eder.
Eğer bir 'a' harfi bulunursa, 4 karakter sonrasında bir 'b' harfi olup olmadığına bakar ve aradaki 3 karakterde 'b' harfi olmamasını şart koşar.
Aynı şekilde, eğer bir 'b' harfi bulunursa, 4 karakter sonrasında bir 'a' harfi olup olmadığına bakar ve aradaki 3 karakterde 'a' harfi olmamasını şart koşar.
Eğer yukarıdaki şartlardan biri sağlanırsa "true" döndürür, aksi halde "false" döndürür.*/