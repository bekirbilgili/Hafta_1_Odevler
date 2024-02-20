import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {

        double price, distance, perKm = 2.2, openingPrice = 10;

        Scanner input = new Scanner (System.in);

        System.out.print("Toplam mesafenizi km cinsinden giriniz: ");
        distance = input.nextDouble();

        price = openingPrice + (distance * perKm);
        price = (price < 20) ? 20 : price;
        System.out.print("Taksi ücretiniz: " + price);
    }
}
