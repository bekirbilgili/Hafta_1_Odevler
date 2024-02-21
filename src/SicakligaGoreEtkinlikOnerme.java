import java.util.Scanner;

public class SicakligaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner (System.in);
        System.out.print("Hava sıcaklığını girin: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak Yapabilirsiniz.");
        }else if (heat >= 5 && heat < 25) {
            if(heat <=15) {
                System.out.println("Sinemaya gidebilirsin");
            }
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsin");
            }
            if (heat >=10) {
                System.out.println("Pikniğe gidebilirsin");
            }
        }else {
            System.out.println("Yüzmeye gidebilirin");
        }
    }
}
