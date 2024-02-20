import java.util.Scanner;

public class Aritmetik_Islemler_Islem_Onceligi {
    public static void main(String[] args) {

        // değişkenleri tanımla
        double a, b, c, sonuc;

        //kullanıcıdan a b ve c değerleri alınsın
        Scanner input = new Scanner (System.in);

        System.out.print("a sayısını sirin: ");
        a = input.nextDouble();

        System.out.print("b sayısını sirin: ");
        b = input.nextDouble();

        System.out.print("c sayısını sirin: ");
        c = input.nextDouble();

        // sonucu hesapla
        sonuc = a + b*c - b;
        System.out.print("İşlemin sonucu: " + sonuc);
    }
}
