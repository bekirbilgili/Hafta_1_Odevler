import java.util.Scanner;

public class PowerofFourandFive {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaça kadar olan kuvvetler bulunsun: ");
        n = input.nextInt();

        System.out.println("4'ün kuvvetleri olan sayılar");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in kuvveti olan sayılar: ");
        for (int j = 1; j <= n; j *= 5)
            System.out.println(j);

    }
}
