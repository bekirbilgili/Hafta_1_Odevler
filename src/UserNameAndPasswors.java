import java.util.Scanner;

public class UserNameAndPasswors {
    public static void main(String[] args) {

        String userName, password, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı girin: ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi girin: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz yanlış!!");
        }

        if (!(password.equals("java123"))) {
            System.out.print("Şifrenizi sıfırlamak ister misin: \nEvet için evet Hayır için hayir yazın:");
            String yesOrNo;
            yesOrNo = inp.nextLine();
            if (yesOrNo.equals("evet")){
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = inp.nextLine();
                if (newPassword.equals("java123")){
                    System.out.println("Eski şifre ile yeni şifreniz aynı olamaz!!!");
                }else if(newPassword.equals(password)){
                    System.out.print("Yeni şifreniz hatalı girdiğiniz şifre ile aynı olamaz!!!");
                }else {
                    System.out.println("Yeni şifreniz oluşturuldu...");
                    System.out.println("Eski şifreniz olan 'java123', yeni şifreniz " + newPassword + " ile değiştirildi");
                }
            }else if (yesOrNo.equals("hayir")) {
                System.out.print("inş hatırlarsın");
            }else {
                System.out.println("Hatalı giriş yaptınız başa dönün...");
            }
        }
    }
}
