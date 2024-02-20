import java.util.Scanner;

public class Manav_Kasa_Programi {
    public static void main(String[] args) {

        // Değişkenleri tanımlayalım
        double armutMiktar, elmaMiktar, domatesMiktar, muzMiktar, patlicanMiktar, toplamTutar;
        double armutKgFiyat = 2.14, elmaKgFiyat = 3.67, domatesKgFiyat = 1.11, muzKgFiyat = 0.95, patlicanKgFiyat = 5;

        //Kullanıcıdan alınanların miktarını isteyelim.
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız: ");
        armutMiktar = input.nextDouble();

        System.out.print("Kaç kilo elma aldınız: ");
        elmaMiktar = input.nextDouble();

        System.out.print("Kaç kilo domates aldınız: ");
        domatesMiktar = input.nextDouble();

        System.out.print("Kaç kilo muz aldınız: ");
        muzMiktar = input.nextDouble();

        System.out.print("Kaç kilo patlıcan aldınız: ");
        patlicanMiktar = input.nextDouble();

        // Toplam aliişveriş tutarını hesaplayalım
        toplamTutar = (armutMiktar*armutKgFiyat) + (elmaMiktar*elmaKgFiyat) + (domatesMiktar*domatesKgFiyat) + (muzMiktar*muzKgFiyat) + (patlicanMiktar*patlicanKgFiyat);
        System.out.print("Toplam alışveriş tutarınız: " + toplamTutar + " TL'dir");
    }
}
