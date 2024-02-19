import java.util.Scanner;
public class Ucgen_Alan_Hesaplama {
    public static void main(String[] args) {

        //Değişkenleri Tanımlayalım
        double kenar1, kenar2, kenar3, u, alan, alanKare;

        //Kullanıcıdan kenar uzunluklarını alalım

        Scanner input = new Scanner (System.in);
        System.out.print("Birinci Kenar Uzunluğunu Girin: ");
        kenar1 = input.nextDouble();

        System.out.print("İkinci Kenar Uzunluğunu Girin: ");
        kenar2 = input.nextDouble();

        System.out.print("Üçüncü Kenar Uzunluğunu Girin: ");
        kenar3 = input.nextDouble();

        /* Değerin karesini almak için math.sqrt kullanıldı.
        ayrıca kenar değerleri ve u arasındaki farkın daima pozitif olması için math.abs komutu kullanıldı*/
        u = (kenar1 + kenar2 + kenar3)/2;
        alanKare = u*Math.abs(u-kenar1)*Math.abs(u-kenar2)*Math.abs(u-kenar3);
        alan = Math.sqrt(alanKare);
        System.out.println("Girilen çeşitkenar üçgenin alanı: " + alan);

    }
}
