import java.util.Scanner;

public class MaxAndMinFinder {
    public static void main(String[] args) {

        /* KULLANICININ SEÇTİĞİ MİKTARDA SAYI GİREREK BU SAYILARIN EN BÜYÜK VE EN KÜÇÜĞÜNÜ BULUR */

        // Değişkenleri tanımlayalım

        int number;
        int tempNumber = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        //Kullanıcıdan kaç tane sayı girmke istediğini alalım

        Scanner input = new Scanner (System.in);
        System.out.print("Kaç adet Sayı gireceksiniz: ");
        number = input.nextInt();

        // Girilecek sayıların en büyük ve en küçüğünü for döngüsü kullanarak belirleyelim.

        for (int i = 1 ; i <= number; i++){
            System.out.print(i +  ". Sayıyı Giriniz:");
            tempNumber = input.nextInt();

            if (tempNumber > max) {
                max = tempNumber;
            }

            if ( tempNumber < min) {
                min = tempNumber;
            }
        }

        System.out.println("Girilen " + number + " Sayıdan" + " En büyüğü: " + max + " En küçüğü: " + min);


    }
}
