import java.util.Scanner;

public class DaireAlanHesaplama {
    public static void main(String[] args) {

        double radius, area, centerAngle, pi = 3.141592;

        Scanner input = new Scanner (System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        radius = input.nextDouble();
        System.out.print("Dairenin merkez açısını giriniz[°]: ");
        centerAngle = input.nextDouble();

        area = (pi*radius*radius)*(centerAngle/360);

        System.out.println("Dairenin alanı:" + area);

    }
}
