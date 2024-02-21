import java.util.Scanner;

public class SinifGectiKaldi {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, ortalama;
        int toplamNot = 0, dersSayisi = 0;

        Scanner input = new Scanner (System.in);

        System.out.print("Matematik Notunuzu Girin: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Girin: ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuzu Girin: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuzu Girin: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuzu Girin: ");
        muzik = input.nextInt();

        if (mat <= 100 && mat > 0){
            toplamNot = toplamNot + mat;
            dersSayisi = dersSayisi + 1;
        }else {
            System.out.println("Matematik notu ortalamaya katılmadı...");
        }

        if (fizik <= 100 && fizik > 0){
            toplamNot = toplamNot + fizik;
            dersSayisi = dersSayisi + 1;
        }else {
            System.out.println("Fizik notu ortalamaya katılmadı...");
        }

        if (turkce <= 100 && turkce > 0){
            toplamNot = toplamNot + turkce;
            dersSayisi = dersSayisi + 1;
        }else {
            System.out.println("Türkçe notu ortalamaya katılmadı...");
        }

        if (kimya <= 100 && kimya > 0){
            toplamNot = toplamNot + kimya;
            dersSayisi = dersSayisi + 1;
        }else {
            System.out.println("Kimya notu ortalamaya katılmadı...");
        }

        if (muzik <= 100 && muzik > 0){
            toplamNot = toplamNot + muzik;
            dersSayisi = dersSayisi + 1;
        }else {
            System.out.println("Müzik notu ortalamaya katılmadı...");
        }

        ortalama = toplamNot / dersSayisi;

        System.out.println("derslerinizin ortalaması: " + ortalama);

        if (ortalama >= 55){
            System.out.print("Sınıfı geçtiniz");
        }else {
            System.out.print("Sınıfta kaldınız");}

    }
}
