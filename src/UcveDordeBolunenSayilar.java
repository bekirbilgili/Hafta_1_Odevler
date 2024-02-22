import java.util.Scanner;

public class UcveDordeBolunenSayilar {
    public static void main(String[] args) {

        int summatian = 0, count = 0 ;
        double average;
        int k, i;

        Scanner input = new Scanner (System.in);
        System.out.print("Kaça kadar olan sayıları hesaplamak istiyorsun: ");
        k = input.nextInt();

        for (i = 0; i<=k; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                summatian = summatian + i;
                count = count + 1;
                System.out.println(i + "Hem 3 hem de 4 e bölünür");
            }
        }

        average = summatian/count;
        System.out.print( " 0'dan" + k + "sayısına kadar olan 3 ve 4 ün katı olan sayıların ortalaması: "+ average);

    }
}
