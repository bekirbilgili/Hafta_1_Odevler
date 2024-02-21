import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {

        double num1, num2, num3;

        Scanner input = new Scanner (System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        num1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextDouble();

        System.out.print("Üçüncü sayıyı giriniz: ");
        num3 = input.nextDouble();

        if ((num1 < num2) && (num1 < num2)) {
            if (num2 < num3) {
                System.out.println("Sayı1 < Sayı2 < Sayı3");
            }else if (num3 < num2) {
                System.out.println("Sayı1< Sayı3 < Sayı2");
            }
        }else if ((num2<num1) && (num2<num3)) {
            if(num3<num1){
                System.out.println("Sayı2 < Sayı3 < Sayı1");
            }else if (num1<num3) {
                System.out.println("Sayı2 < Sayı1 < Sayı3");
            }
        }else if ((num3<num2)&&(num3<num1)) {
            if (num2<num1) {
                System.out.println("Sayı3 < Sayı2 < Sayı1");
            }else if (num1<num2) {
                System.out.println("Sayı3 < Sayı1 < Sayı2");
            }
        }

    }
}
