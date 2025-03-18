package coderbyte;

import java.util.Scanner;

class Division {


    //solution 1: İteratif
    public static int Division(int num1, int num2) {
        // code goes here
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }


    //solution 2: Rekürsif
     /*public static int Division(int num1, int num2) {
        return num2 != 0 ? num1 : Division(num2, num1 % num2);
    }*/

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Division(7, 3));
    }


    /*public static int Division(int num1, int num2) {
        return num2 != 0 ? num1 : Division(num2, num1 % num2);
    }*/


    /*public static int Division(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }*/

}



/*Her iki algoritma da özünde aynı Öklid algoritmasını kullanıyor, sadece uygulama yöntemleri farklı (iteratif vs.
rekürsif). Bu nedenle, matematiksel zaman karmaşıklıkları aynıdır: O(log(min(a, b))).
Bu karmaşıklık şöyle açıklanabilir:

Her adımda, a ve b değerlerinden biri en az yarıya düşer, bu da en kötü durumda log(min(a, b)) adımda sonuca
ulaşacağımız anlamına gelir.
Öklid algoritması, Fibonacci sayıları üzerinde test edildiğinde en kötü performansı verir, ve bu durumda adım sayısı
yaklaşık olarak log tabanında phi (altın oran) olan logaritmiktir.

İki çözüm arasındaki pratik farklar:

Bellek kullanımı: Rekürsif çözüm her çağrı için call stack'te yer kaplar, bu nedenle O(log(min(a, b))) kadar extra
bellek kullanır. İteratif çözüm ise sabit miktarda ek bellek kullanır (O(1)).
Performans: Teorik olarak aynı zaman karmaşıklığına sahip olmalarına rağmen, rekürsif çağrıların ek yükü nedeniyle
iteratif çözüm genelde biraz daha hızlıdır.
Okunabilirlik: Rekürsif çözüm daha kısa ve bazıları için daha zarif/anlaşılır olabilir.

Pratikte, çok büyük sayılar için iteratif çözüm daha güvenlidir, çünkü rekürsif çözüm çok derin çağrılara neden
olabilir ve stack overflow hatası oluşturabilir. Ancak belirtilen problemde sayılar 10^3 ile sınırlı olduğu için her
iki yöntem de güvenle kullanılabilir.*/