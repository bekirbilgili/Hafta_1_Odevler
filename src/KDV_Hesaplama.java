import java.util.Scanner;

public class KDV_Hesaplama {
    public static void main(String[] args) {

        // Değişkenleri Tanımalayalım,

        double tutar, kdvOrani, kdvMiktari, kdvliTutar;
        //kdvOranı08 = 0.08;
        //kdvOrani18 = 0.18;

        Scanner input = new Scanner (System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();
        if (tutar < 0){
            System.out.println("Yanlış tutar girdiniz!!!");
        }
        if (tutar>0 && tutar<1000){
            kdvOrani = 0.18;
            kdvMiktari = tutar * kdvOrani;
            kdvliTutar = tutar + kdvMiktari;
            System.out.println("Mal Tutarı: " + tutar);
            System.out.println("KDV Oranı: " + kdvOrani);
            System.out.println("KDV Miktarı: " + kdvMiktari);
            System.out.println("KDV'li Tutar: " + kdvliTutar);
        }
        if (tutar>=1000){
            kdvOrani = 0.08;
            kdvMiktari = tutar * kdvOrani;
            kdvliTutar = tutar + kdvMiktari;
            System.out.println("Mal Tutarı: " + tutar);
            System.out.println("KDV Oranı: " + kdvOrani);
            System.out.println("KDV Miktarı: " + kdvMiktari);
            System.out.println("KDV'li Tutar: " + kdvliTutar);
        }

    }
}
