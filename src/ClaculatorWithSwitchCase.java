import java.util.Scanner;

public class ClaculatorWithSwitchCase {
    public static void main(String[] args) {

        // Identify the variables
        int num1, num2;
        int operator;

        // User enters variables
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        num1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        num2 = input.nextInt();
        System.out.print("Hangi işlemi yapmak istiyorsun?\n1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme\nİşlem seçin: ");
        operator = input.nextInt();

        // Generatıng switch case statements
        switch (operator) {
            case 1:
                System.out.print("İki sayınını toplamı: " + (num1 + num2));
                break;
            case 2:
                System.out.print("İki sayınını farkı: " + (num1 - num2));
                break;
            case 3:
                System.out.print("İki sayınını çarpımı: " + (num1 * num2));
                break;
            case 4:
                switch (num2){
                    case 0:
                        System.out.print("Bir sayı 0'a bölünemez");
                        break;
                    default:
                        break;
                }
                System.out.print("İki sayınını birbirine bölümü: " + (num1 / num2));
                break;
            default:
                System.out.print("Hatalı işlem seçtiniz tekrar deneyin!!!");
        }
    }
}
