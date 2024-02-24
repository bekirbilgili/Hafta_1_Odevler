import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {

        String userName, password;
        int right = 3;
        int balance = 1500;
        int selection;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Girin: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Bilgili Baknkaya Hoş Geldiniz.");
                do {

                    System.out.println("1 - Para Yatırma\n2 - Para Çekme\n3 - Bakiye Sorgulama\n4 - Çıkış Yap");
                    System.out.println("Lütfen yapnak istediğiniz işilei seçin:");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("Yatıracağınız mikrarı girin:");
                            int price = input.nextInt();
                            balance = balance + price;
                            break;
                        case 2:
                            System.out.print("Çekeceğiniz Miktarı Seçin:");
                             price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz Bakiye!!");
                            } else {
                                balance = balance - price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:" + balance);
                            break;

                    }
                } while (selection != 4 ); {
                    System.out.println("Tekrar Görüşme Üzere :))");
                }
                break;
            } else {
                right--;
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. İletişime geçin.");
                } else {
                    System.out.println("Kalan Hakkınız:" + right);
                }
            }
        }


    }
}
