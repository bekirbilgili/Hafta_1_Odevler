import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {

        // Kullanıcıdan kaçıncı seiye kadar açılılm istediğini alalım
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        int num1 = 0, num2 = 1; // başlangıç değerleri
        System.out.print(n + " Elemanlı Fibonacci Serisi : ");

        for (int i = 1; i <= n; i++) { // sayıları ard arda toplamak iiçn for döngüsü kullanıdı
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
