import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {

        int r,n, fark, combination;
        int factorial1 = 1, factorial2=1, factorial3 = 1 ;

        Scanner input = new Scanner (System.in);
        System.out.print("Sayı gir: ");
        n = input.nextInt();
        System.out.print("Sayı gir: ");
        r = input.nextInt();

        if ( n > r ) {
            for (int i = 1 ; i <= n ; i++){
                factorial1 = factorial1 * i;
            }
            for (int j = 1 ; j <= r ; j++) {
                factorial2 = factorial2 * j;
            }

            fark = n - r;

            for (int k = 1 ; k <= fark; k++){
                factorial3 = factorial3 * k;
            }

        }else {
            System.out.println("N, R den küçük olamaz.");
        }

        combination = factorial1 / (factorial2*factorial3);

        System.out.println(n + "'in " + r + "'li kombinasyonu :"+ combination);


    }
}
