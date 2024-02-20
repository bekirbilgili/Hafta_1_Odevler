import java.util.Scanner;

public class UserNameAndPasswors {
    public static void main(String[] args) {

        String userName, password;

        Scanner inp = new Scanner (System.in);

        System.out.print("Kullanıcı adınızı girin: ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi girin: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız.");
        }else {
            System.out.println("Bilgileriniz yanlış!!");
        }

        if (!(password.equals("java123"))) {
            System.out.print("Şifrenizi sıfırlamak ister misin: \nEvet için 1 Hayır için 2:");
            int yesOrNo;
            yesOrNo = inp.nextInt();
            switch (yesOrNo) {
                case 1:
            }
        }
    }
}
