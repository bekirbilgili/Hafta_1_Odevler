import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        /* Program calculates Chinese Zodiac with a given year by user */

        // define variables

        String zodiac = "";
        int birthYear;

        // get birht year form useer
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılını giriniz: ");
        birthYear = input.nextInt();

        // find the zodiac by % 12

        if (birthYear % 12 == 0) {
            zodiac = "Maymun";
        } else if (birthYear % 12 == 1) {
            zodiac = "Horoz";
        } else if (birthYear % 12 == 2) {
            zodiac = "Köpek";
        } else if (birthYear % 12 == 3) {
            zodiac = "Domuz";
        } else if (birthYear % 12 == 4) {
            zodiac = "Fare";
        } else if (birthYear % 12 == 5) {
            zodiac = "Öküz";
        } else if (birthYear % 12 == 6) {
            zodiac = "Kaplan";
        } else if (birthYear % 12 == 7) {
            zodiac = "Tavşan";
        } else if (birthYear % 12 == 8) {
            zodiac = "Ejderha";
        } else if (birthYear % 12 == 9) {
            zodiac = "Yılan";
        } else if (birthYear % 12 == 10) {
            zodiac = "At";
        } else if (birthYear % 12 == 11) {
            zodiac = "Koyun";
        }else {
            System.out.println("Bir hata oldu tekrar deneyin");
        }

        System.out.println("Çin zodyak burcunuz: " + zodiac);
    }
}
