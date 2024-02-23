import java.util.Scanner;

public class BasamaSayilariniToplama {
    public static void main(String[] args) {

        int number, basValue, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak değerleri toplanacak sayıyı girin: ");
        number = input.nextInt();

        int tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
           // System.out.println(basValue);
            tempNumber = tempNumber/10;
            total = total + basValue;

        }

        System.out.println(total);
    }
}
