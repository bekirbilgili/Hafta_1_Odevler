import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {

        int base, power;
        int total = 1;

        Scanner input = new Scanner (System.in);
        System.out.print("Tabanı girin: ");
        base = input.nextInt();
        System.out.print("Kuvveti (üssü) girin:");
        power = input.nextInt();


        for (int i = 1; i<= power; i++ );{
            total *= base;
        }

        System.out.println(total);

    }
}
