import java.util.Scanner;

public class TekGireneKadarCiftleriTopla {
    public static void main(String[] args) {
        int k;
        int total = 0;

        Scanner input = new Scanner (System.in);
        System.out.println("Siz tek sayı girene kadar girdiğiniz çift ve 4 ün katı olan sayılar toplanacaktır.");


        do {
            System.out.print("Bir Sayı girin: ");
            k = input.nextInt();
            if (k % 2 ==0 || k % 4 == 0) {
                total = total + k;
            }
        } while (k % 2 == 0);

        System.out.println("Toplam: " + total);

    }
}
