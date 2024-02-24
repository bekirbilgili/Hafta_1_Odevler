import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {


        int num1, num2;
        int ebob = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Ebobu hesaplanacak sayıları gir:");
        System.out.print("Numara 1: ");
        num1 = input.nextInt();
        System.out.print("Numara 2: ");
        num2 = input.nextInt();

        if (num1>num2) {
            System.out.println("Numara 2 numara1 den küçük olmalı!!!");
        }else {

            for (int k = num1; k>=1 ; k--) {
                if (num1 % k == 0 && num2 % k ==0) {
                    ebob = k;
                    break;
                }
            }
            System.out.println("Ebob = " + ebob);
        }

        int num3, num4;

        System.out.println("Ekoku hesaplanacak sayıları gir:");
        System.out.print("Numara 3: ");
        num3 = input.nextInt();
        System.out.print("Numara 4: ");
        num4 = input.nextInt();

        for (int i =1 ; i <= num3* num4; i++ ) {
            if ( i % num3 ==0 && i % num4 == 0) {
                int ekok = i;
                System.out.println("girile sayıların ekok'u=" + ekok);
                break;
            }

        }



    }
}
