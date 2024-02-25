import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {

        /* Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
        toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        Bu program girilen sayının mükemmel sayı olup olmadığını belirler  */

        // Değişkenlerin tanımlanası

        int number;
        int toplam = 0;

        // kullanıcıya her sayı girdikten sonra tekrar tekar girdi yapabilmesi için do while döngüsü kullanıld
        do {
            // Kullanıcıdan sayının alınması
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen sayı giriniz: ");
            number = input.nextInt();

            for (int i = 1; i < number; i++) { //for döngüsü ile sayının bölenlerinin toplamı hesaplandı
                if (number % i == 0) {
                    toplam += i;
                }
            }

            if (toplam == number) {
                System.out.println(number + " Bir mükemmel sayıdır.");
            } else {
                System.out.println(number + " Bir mükemmel sayı değildir.");
            }
            toplam = 0;


        }while (number > 0);


    }
}
