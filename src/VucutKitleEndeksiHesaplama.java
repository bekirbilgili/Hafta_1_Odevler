import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {

        // Değişkenleri tanımlayalım
        double height, weight, bodyMassIndex ;

        // Kullanıcıdan boyunu ve kilosunu isteyelim
        Scanner input = new Scanner (System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        height = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        weight = input.nextDouble();

        // Vücut kitle indeksini hesaplayalım

        bodyMassIndex = weight / (height*height);
        System.out.print("Vücut kitle endeksiniz: " + bodyMassIndex);
    }
}
