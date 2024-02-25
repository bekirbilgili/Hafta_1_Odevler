import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {

        /* Basamak sayısı kullanıcıdan alınarak ters üçgen yapımı */

        // Değişkenşn tanımlanması
        int height;

        // Kullanıcıdan girdi alınması
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen basamak sayısını giriniz: ");
        height = input.nextInt();

        // Yıldızları oluşturmak için iç içe for döngüsü kullanıldı
        for (int i = 0 ; i<=height; i++){
            for (int j =1; j <= height-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
