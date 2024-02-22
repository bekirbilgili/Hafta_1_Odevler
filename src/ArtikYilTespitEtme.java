import java.util.Scanner;

public class ArtikYilTespitEtme {
    public static void main(String[] args) {

        //PROGRAM GİRİLEN YILIN ARTIK YIL ( ŞUBAT AYININ 29 GÜN ÇEKTİĞİ YILLAR) OLUP OLMADIĞINI BULUR

        // defining variables
        int year;

        // year input from user
        Scanner input = new Scanner (System.in);
        System.out.print("Lütfen yılı giriniz: ");
        year = input.nextInt();

        //determination of leap year

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println( year + " artık yıldır!!!");
        } else if (year % 400 == 0) {
            System.out.println(year + " artık yıldır");
        }else {
            System.out.println(year + " artık yıl değildir");
        }

    }
}
